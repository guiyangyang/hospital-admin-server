package com.space.alzheimer.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

/**
 * @ClassName SendEmailUtil
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/18
 **/
@Component
public class SendEmailUtil {

    public static final String FROM_ADDRESS = "1156162414@qq.com";

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String toAddress, String subject, String text) throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 发送方邮箱
        helper.setFrom(FROM_ADDRESS);
        // 接收方邮箱
        helper.setTo(toAddress);
        // 主题
        helper.setSubject(subject);
        // 内容
        helper.setText(text);
        javaMailSender.send(mimeMessage);
    }

}