# Spring Boot Email Sender Project

- This project demonstrates a simple email sender using Spring Boot and Thymeleaf.
- It allows you to send emails with a custom subject and message via a form in the browser.
- This example is a great starting point for integrating email functionality into a web application.

## Features

- Send emails using the Spring Boot framework.
- Integration with Thymeleaf for rendering the frontend.
- Simple form-based interface to send custom messages.
- Configurable SMTP settings.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- JavaMailSender
- Bootstrap

## Prerequisites

- Java 11 or higher
- Maven
- An SMTP server (e.g., Gmail)
- Internet connection

## Getting Started

### 1. Clone the Repository

```
git clone https://github.com/yourusername/spring-boot-email-sender.git
cd spring-boot-email-sender
```

### 2. Configure SMTP Settings
- Update the SMTP settings in the application.properties file located in src/main/resources.
- Replace the placeholder values with your actual email credentials.
```
properties

- spring.mail.host=smtp.gmail.com
- spring.mail.port=587
- spring.mail.username=your.email@gmail.com
- spring.mail.password=yourpassword
- spring.mail.properties.mail.smtp.auth=true
- spring.mail.properties.mail.smtp.starttls.enable=true
```

### 3. Run the Application
- You can run the application using Maven. Execute the following command in the project directory:
  
```mvn spring-boot:run```

- The application will start and run on http://localhost:8080.

### 4. Access the Email Sender Form
- Open your web browser and navigate to:

```http://localhost:8080/send-email```

- You will see a form where you can enter the recipient's email address. Upon submission, an email will be sent with a pre-defined subject and message.
