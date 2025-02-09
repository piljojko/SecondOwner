package com.example.demo.model;

public class Email {
    private String username;
    private final char SYMBOL = '@';
    private String mailServer;
    private String domain;
    public Email(String email) {
        if (countCharOccasion(email, SYMBOL) != 1) {
            throw new RuntimeException("Invalid email");
        }
        if (countCharOccasion(email, '.') != 1) {
            throw new RuntimeException("Invalid email");
        }
        String[] splitBySymbol = email.split(String.valueOf(SYMBOL));
        username = splitBySymbol[0];
        String[] splitByDot = splitBySymbol[1].split("\\.");
        mailServer = splitByDot[0];
        domain = splitByDot[1];
    }



    private int countCharOccasion(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return username + SYMBOL + mailServer + '.' + domain;
    }
}
