package com.mail.send.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mail.send.service.EmailService;

@Controller
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/send-email")
    public String showEmailForm() {
        return "send-email";
    }

    @PostMapping("/send-email")
    public String sendEmail(
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("text") String text,
            Model model) {
        emailService.sendSimpleEmail(to, subject, text);
        model.addAttribute("message", "Email sent successfully!");
        return "send-email";
    }
}

