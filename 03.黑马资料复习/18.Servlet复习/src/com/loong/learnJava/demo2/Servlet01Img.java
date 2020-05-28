package com.loong.learnJava.demo2;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 *  向浏览器输出图片，验证码
 */

@WebServlet("/servlet07")
public class Servlet01Img extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedImage img = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = img.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 80, 20);
        graphics.setColor(Color.cyan);
        graphics.setFont(new Font(null, Font.BOLD, 20));

        Random random = new Random();
        int aint = random.nextInt(999999);
        String str = String.valueOf(aint);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6 - str.length(); i++) {
            sb.append("0");
        }
        String number = sb.append(str).toString();

        graphics.drawString(number, 0, 20);
        resp.setHeader("ContentType", "jpeg");
        ImageIO.write(img, "jpg", resp.getOutputStream());
    }
}
