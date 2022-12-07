package com.unitedcoder.homework.allhomework;

public class NewsLetterSubject {
    private String senderName;
    private String senderEmail;

    public NewsLetterSubject() {
    }

    public NewsLetterSubject(String senderName, String senderEmail) {
        this.senderName = senderName;
        this.senderEmail = senderEmail;
    }

    public String newsLetterInfo(){return senderName+" "+senderEmail;}

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public static void main(String[] args) {
        NewsLetterSubject newsLetterSubject=new NewsLetterSubject("ayingar",
                "ayniharalim@gmail.com");
        System.out.println(newsLetterSubject.newsLetterInfo());
        NewsLetterSubject newsLetterSubject1=new NewsLetterSubject();
        newsLetterSubject1.setSenderName("sattar");
        newsLetterSubject1.setSenderEmail("sattar14@gmail.com");
        System.out.println(newsLetterSubject1.newsLetterInfo());
    }

}
