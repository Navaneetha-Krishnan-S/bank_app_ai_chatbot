package com.example.bankapp.controller;

import com.example.bankapp.model.Account;
import com.example.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dialogflow")
public class DialogflowController {

    private final AccountService accountService;

    @Autowired
    public DialogflowController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/webhook")
    public Map<String, Object> handleDialogflowRequest(@RequestBody Map<String, Object> requestBody) {
        System.out.println("Received request: " + requestBody);
        Map<String, Object> response = new HashMap<>();

        // Safely extract intent name
        Map<String, Object> queryResult = (Map<String, Object>) requestBody.get("queryResult");
        if (queryResult != null) {
            String intentName = (String) ((Map<?, ?>) queryResult.get("intent")).get("displayName");

            // Get the logged-in user
            Map<String, Object> parameters = (Map<String, Object>) queryResult.get("parameters");
            String username = (String) parameters.get("username");

            if (username != null) {
                Account account = accountService.findAccountByUsername(username);

                switch (intentName) {
                    case "CheckBalance":
                        double balance = account.getBalance().doubleValue();
                        response.put("fulfillmentText", "Your current balance is: " + balance + " INR.");
                        break;

                    case "TransactionHistory":
                        StringBuilder transactionsResponse = new StringBuilder("Your recent transactions are:\n");
                        accountService.getTransactionHistory(account).forEach(transaction -> {
                            transactionsResponse.append(transaction.getType())
                                    .append(": ")
                                    .append(transaction.getAmount())
                                    .append(" USD on ")
                                    .append(transaction.getTimestamp())
                                    .append("\n");
                        });
                        response.put("fulfillmentText", transactionsResponse.toString());
                        break;

                    default:
                        response.put("fulfillmentText", "I'm sorry, I didn't understand that.");
                }
            } else {
                response.put("fulfillmentText", "No username provided.");
            }
        } else {
            response.put("fulfillmentText", "Invalid request format.");
        }

        return response;
    }
}
