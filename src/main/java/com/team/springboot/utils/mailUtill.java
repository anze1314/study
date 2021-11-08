package com.team.springboot.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class mailUtill {


    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String address , String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("test");
        message.setFrom("2383353360@qq.com");
        message.setTo(address);
        message.setText("hello world");
        javaMailSender.send(message);
    }


}
