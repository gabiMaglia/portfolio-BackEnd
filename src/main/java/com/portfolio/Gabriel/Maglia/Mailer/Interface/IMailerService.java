package com.portfolio.Gabriel.Maglia.Mailer.Interface;

import com.portfolio.Gabriel.Maglia.Mailer.Entity.Mailer;
import org.springframework.mail.javamail.JavaMailSender;

public interface IMailerService {

    public void sendMail(Mailer email);


}
