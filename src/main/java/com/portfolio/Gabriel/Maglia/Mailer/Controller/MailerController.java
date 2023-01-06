package com.portfolio.Gabriel.Maglia.Mailer.Controller;


import com.portfolio.Gabriel.Maglia.Mailer.Entity.Mailer;
import com.portfolio.Gabriel.Maglia.Mailer.Interface.IMailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationException;

@RestController
@CrossOrigin(origins = "http://localHost:4200")
public class MailerController {
    @Autowired
    IMailerService mailerService;

    @PostMapping("/send_email")
    public ResponseEntity<Mailer> createExperience(@RequestBody Mailer email,
                                                    BindingResult bindingResult) throws ValidationException {
        if (bindingResult.hasErrors()){
            throw new ValidationException("Feedback is not valid");
        }
        mailerService.sendMail(email);
        return  new ResponseEntity<>(email, HttpStatus.CREATED);
    }

}
