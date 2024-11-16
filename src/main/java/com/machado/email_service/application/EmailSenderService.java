package com.machado.email_service.application;

import com.machado.email_service.adapters.EmailSenderGateway;
import com.machado.email_service.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.SendEmail(to, subject, body);
    }
}
