package com.machado.email_service.core;

public interface  EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
