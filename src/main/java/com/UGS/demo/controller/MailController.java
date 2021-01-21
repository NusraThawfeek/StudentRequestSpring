package com.UGS.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UGS.demo.config.ResponseHandler;
import com.UGS.demo.entity.Mail;
import com.UGS.demo.service.MailService;

@RestController
public class MailController {
    @Autowired
    private ApplicationContext context;

    /**
     * set email address,subject,sender,email content to sending the mail
     */
    @PostMapping(value = "/sendmail")
    public ResponseEntity<Object> sendmail(@RequestBody MultiValueMap<String, String> values) {

        String emailTo = values.getFirst("emailTo");//Post request should include "emailTo"(receiver email) and its value(in postman "x-www-form-urlencoded" body format)
        String emailFrom = values.getFirst("emailFrom");//Post request should include "emailFrom"(sender email) and its value
        String emailSubject = values.getFirst("emailSubject");
        String emailContent = values.getFirst("emailContent");
        Mail mail = new Mail();
        mail.setMailFrom(emailFrom); //set senders email address
        mail.setMailTo(emailTo); //set receiver's email address
        mail.setMailSubject(emailSubject);
        mail.setMailContent(emailContent);
        MailService mailService = (MailService) context.getBean("mailService");
        mailService.sendEmail(mail);

        //return "successfully send the email";//return a String(text) as success msg
        return ResponseHandler.generateResponse(HttpStatus.OK, "successfully send the email", null);//return a json object as response with success message
    }
}
