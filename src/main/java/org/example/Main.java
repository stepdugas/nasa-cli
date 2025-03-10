package org.example;

import org.example.model.NEOFeedResponse;
import org.example.model.Neo;
import org.example.service.NEOService;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;

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

        for (String key : response.getNearEarthObjects().keySet() ) {
            List<Neo> neoList = response.getNearEarthObjects().get(key);
            int count = neoList.size();
            System.out.println("For Date: " + key + " there are " + count + " near earth objects");
            for (Neo n : neoList) {
                System.out.println("\tId: " + n.getId() );
                System.out.println("\tName: " + n.getName() );
                System.out.println("\tPotentially hazardous: " + n.isPotentiallyHazardousAsteroid() );
                System.out.println("\tEstimated Diameter: " );
                System.out.println("\t\tMin (in miles): " + n.getEstimatedDiameter().getMiles().getEstimatedDiameterMin());
                System.out.println("\t\tMax (in miles): " + n.getEstimatedDiameter().getMiles().getEstimatedDiameterMax());
            }
        }



    }
}