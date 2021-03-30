package com.company;

public class MailAccountApp {

    public static void main(String[] args) {

       Account em1 = new Account("Jan","Kowalski");

        em1.setMailZapasowy("em1@gmail.com");
        System.out.println(em1.getPokazInformacjeOKoncie());
    }
}
