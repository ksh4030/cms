package com.zerobase.cms.user.clients.service;

import com.zerobase.cms.user.clients.MailgunClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest(){
        //mailgunClient.sendEmail(null);
        //String response = emailSendService.sendEmail().toString();
        //System.out.println(response);
    }
}
