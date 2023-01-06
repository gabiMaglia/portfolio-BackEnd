package com.portfolio.Gabriel.Maglia.Mailer.Service;
import com.portfolio.Gabriel.Maglia.Mailer.Component.EmailConfig;
import com.portfolio.Gabriel.Maglia.Mailer.Entity.Mailer;
import com.portfolio.Gabriel.Maglia.Mailer.Interface.IMailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.internet.MimeMessage;

@Service
public class impMailerService implements IMailerService {

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    EmailConfig mailCfg;
    @Override
    public void sendMail(Mailer email) {
        MimeMessage message = mailSender.createMimeMessage();
        System.out.println(email.getEmail());
        try {
            JavaMailSenderImpl mailer = new JavaMailSenderImpl();
            mailer.setHost(this.mailCfg.getHost());
            mailer.setPort(this.mailCfg.getPort());
            mailer.setUsername(this.mailCfg.getUsername());
            mailer.setPassword(this.mailCfg.getPassword());

            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo("gab.maglia@gmail.com");
            helper.setFrom(email.getEmail());
            helper.setSubject("Posible contratacion de " + email.getName() + email.getSurname());
            helper.setText(email.getMensaje());
            mailSender.send(message);


        } catch (Exception e){
            System.out.println(e + "lalalal");
        }
    }


}
