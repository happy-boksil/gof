package com.happybs.builder;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        if(args == null || args.length ==0) {
            FrameBuilder frameBuilder = new FrameBuilder();
            new Director(frameBuilder).construct();
            JFrame frame = frameBuilder.getResult();
            frame.setVisible(true);
        } else if(args.length > 1) {
            usage();
            System.exit(0);
        } else if(args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            new Director(textBuilder).construct();
            System.out.println(textBuilder.getResult());
        } else if(args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            new Director(htmlBuilder).construct();
            System.out.println(htmlBuilder.getResult() + "가 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: java Main plain 일반 텍스트로 문서작성");
        System.out.println("Usage: java Main html html 텍스트로 문서작성");
    }
}
