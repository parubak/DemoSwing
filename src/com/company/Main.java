package com.company;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    static GraphicsEnvironment _graphicsEnvironment;
    static {
        _graphicsEnvironment=GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            InputStream stream=Main.class.getResourceAsStream("/resources/Quartz.ttf");
            Font font=Font.createFont(Font.TRUETYPE_FONT,stream);
            _graphicsEnvironment.registerFont(font);
            stream.close();
        }catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(()->new MyFrame());
    }
}
