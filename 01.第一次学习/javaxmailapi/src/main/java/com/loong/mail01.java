package com.loong;

import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.util.ByteArrayDataSource;
import java.io.File;
import java.sql.Time;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mail01 {
    public static void main(String[] args) throws Exception {

//        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
//            executor.submit(() -> {
//                try {
            sendMail();

//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//            Thread.sleep(1000);
        }
    }


    public static void sendMail() throws Exception{
        // 服务器地址:
        String smtp = "smtp.qq.com";
        // 登录用户名:
        final String username = "362808513@qq.com";
        // 登录口令:
        String password = "wulagnkcaoebbjhf";
        String URL = "C:/Users/lzl36/Desktop/资料/公司产品架构.png";
        // 连接到SMTP服务器587端口:
        Properties props = new Properties();
        props.put("mail.smtp.host", smtp); // SMTP主机名
        props.put("mail.smtp.port", "587"); // 主机端口号
        props.put("mail.smtp.auth", "true"); // 是否需要用户认证
        props.put("mail.smtp.starttls.enable", "true"); // 启用TLS加密
        // 获取Session实例:
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        // 设置debug模式便于调试:
        session.setDebug(true);
        // 文本内容
        MimeMessage message = new MimeMessage(session);
//        // 设置发送方地址:
        message.setFrom(new InternetAddress("362808513@qq.com"));
//        // 设置接收方地址:
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("yanlulu@maxcn.com"));
//        // 设置邮件主题:
        message.setSubject("北京市海淀区公安局", "UTF-8");
//        // 设置邮件正文:
        message.setText("<h2>犯人(闫璐璐)：</h2>" +
                "<p>您触发了中华人民共和国刑法第四百八十六条, 限今日晚8点到刑警大队自首。后果自负</p>" +
                "<p style=\"color: red; text-align: right\">北京市海淀区刑警大队</p>", "UTF-8", "html");

        // 发送图片
//        Multipart multipart = new MimeMultipart();
//        // 添加text:
//        BodyPart textpart = new MimeBodyPart();
//        textpart.setContent("<h1>伸腿瞪眼丸是我们公司的优质产品，价格为100元每盒。已为您通过韵达快递发货，请注意查收。</h1>", "text/html;charset=utf-8");
//        multipart.addBodyPart(textpart);
//        // 添加image:
//        BodyPart imagepart = new MimeBodyPart();
//        imagepart.setFileName("a.png");
//        imagepart.setDataHandler(new DataHandler(new ByteArrayDataSource("", "image/jpeg")));
//        // 与HTML的<img src="cid:img01">关联:
//        imagepart.setHeader("Content-ID", "<img01>");
//        multipart.addBodyPart(imagepart);
//        message.setContent(multipart);

        // 发送:
        Transport.send(message);
    }
}
