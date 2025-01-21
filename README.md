# Bank App with AI Chatbot Integration

![Bank App Banner](https://via.placeholder.com/1200x400.png?text=Bank+App+with+AI+Chatbot)

Welcome to the **Bank App with AI Chatbot Integration**! This project demonstrates a robust banking application built with **Spring Boot** and enhanced with an intelligent AI chatbot using **Dialogflow**. The chatbot provides seamless customer support, making banking more accessible and efficient.

---

## 🌟 Features

### Banking Application
- **User Authentication**: Secure login system for users.
- **Account Management**: View account details and balances.
- **Transaction History**: Keep track of all transactions.
- **Fund Transfers**: Transfer money between accounts effortlessly.

### AI Chatbot (Dialogflow Integration)
- **User Greeting**: Welcomes users to the banking application.
- **Balance Inquiry**: Provides account balance information.
- **Transaction History**: Fetches and displays recent transactions.
- **Natural Language Understanding**: Intuitive and user-friendly interaction.

---

## 🛠️ Tech Stack

### Backend:
- **Java**
- **Spring Boot**
- **Spring Security**

### Frontend:
- **JSP**
- **HTML/CSS**
- **Bootstrap**

### Database:
- **MySQL**

### AI Chatbot:
- **Dialogflow** (Google Cloud)

---

## 🚀 Getting Started

### Prerequisites

1. **Java 11+**
2. **Maven**
3. **MySQL Database**
4. **Google Cloud Account** (for Dialogflow setup)

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Navaneetha-Krishnan-S/bank_app_ai_chatbot.git
   cd bank_app_ai_chatbot
   ```

2. **Set Up MySQL Database**
   - Create a database named `bank_app`.
   - Update the `application.properties` file with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/bank_app
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Dialogflow Integration**
   - Import the Dialogflow agent provided in the `/dialogflow-agent` directory.
   - Update the Google Cloud credentials in the application.

5. **Access the Application**
   - Open your browser and navigate to `http://localhost:8080`.

---


## 🤖 Dialogflow Setup

1. Log in to [Dialogflow Console](https://dialogflow.cloud.google.com/).
2. Create a new agent or import the provided agent in `/dialogflow-agent`.
3. Connect the Dialogflow agent to your Google Cloud project.
4. Obtain the JSON credentials file for your service account and add it to the application.

---

## 📸 Screenshots

### 1. **Homepage**
![Homepage](https://via.placeholder.com/800x400.png?text=Homepage)

### 2. **AI Chatbot Interaction**
![Chatbot](https://via.placeholder.com/800x400.png?text=AI+Chatbot+Interaction)

### 3. **Transaction History**
![Transaction History](https://via.placeholder.com/800x400.png?text=Transaction+History)

---

## 🧑‍💻 Author

**Navaneetha Krishnan S**
- 🌐 [Portfolio](https://navaneethakrishnan.rf.gd/)
- 💼 [LinkedIn](https://www.linkedin.com/in/navaneetha-krishnan-s-/)

---


Feel free to 🌟 this repository if you find it useful!
