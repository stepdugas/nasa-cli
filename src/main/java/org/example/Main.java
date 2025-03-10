package org.example;

import org.example.model.NEOFeedResponse;
import org.example.service.NEOService;

import java.sql.SQLOutput;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to my Near Earth Object App");
        System.out.println();
        LocalDate date = LocalDate.now();
        //System.out.println(date);
        NEOService service = new NEOService();
        NEOFeedResponse response = service.getNEODate(String.valueOf(date));

    }
}