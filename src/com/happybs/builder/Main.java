package com.happybs.builder;


public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            usage();
            System.exit(0);
        }
        if(args[0].equals("plain")) {
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
