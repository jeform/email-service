package com.machado.email_service.adapters;

public interface EmailSenderGateway {

    void SendEmail(String to, String subject, String body);
}
