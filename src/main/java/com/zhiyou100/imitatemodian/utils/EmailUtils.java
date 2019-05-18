package com.zhiyou100.imitatemodian.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author DingYC
 * @create 2019-05-15 15:52
 **/
@Component
public class EmailUtils {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;
    /**
     * 发邮件
     * @param to 接收者邮箱
     * @param text 邮件内容
     */
    public void setMail(String to, String text) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(from);
        message.setTo(to);
        message.setText(text);

        mailSender.send(message);


    }

}
