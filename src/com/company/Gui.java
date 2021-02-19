package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Gui {
    public static String start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jméno: ");
        return sc.nextLine();
    }

    public static void displayMessage(ArrayList<String> messages) {
        if(messages.size()==0) {
            System.out.println("--Žádné předchozí zprávy--");
            return;
        } else if(messages.size() < 5){
            System.out.println("V databázy máš "+(messages.size()-1)+" zprávy:");
        } else {
            System.out.println("V databázy máš "+(messages.size()-1)+" zpráv:");
        }
        System.out.println("-----------------------------");
        for (String message : messages) {
            if(message != null) System.out.println(message);
        }
        System.out.println("-----------------------------");
        System.out.println("Pro ukončení zápisu zpráv zadej `!konec`");
    }

    public static String newMessage() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
