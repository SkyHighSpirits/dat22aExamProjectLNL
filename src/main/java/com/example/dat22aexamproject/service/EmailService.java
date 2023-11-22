package com.example.dat22aexamproject.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.mail.MailSender;
        import org.springframework.mail.SimpleMailMessage;
        import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private MailSender mailSender;

    public void sendEmail(String recipient, String subject, String body) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(recipient);
            message.setSubject(subject);
            message.setText(body);

            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
