package com.puttel.app;

import javax.swing.*;
import java.awt.*;

public class PuttelApp {
    public PuttelApp() {
        new MainApp();
    }

    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    macosConfig();
                    new PuttelApp();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public static void macosConfig() {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
    }
}