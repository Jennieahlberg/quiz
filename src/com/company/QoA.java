package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class QoA {

    public QoA() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Map<String, String> capitals = new LinkedHashMap<>();

        capitals.put("Sverige", "Stockholm");
        capitals.put("Norge", "Oslo");
        capitals.put("Danmark", "Köpenhamn");
        capitals.put("Storbrittanien", "London");
        capitals.put("Finland", "Helsingfors");
        capitals.put("Estland", "Tallinn");
        capitals.put("Ryssland", "Moskva");
        capitals.put("Frankrike", "Paris");
        capitals.put("Italien", "Rom");
        capitals.put("Spanien", "Madrid");
        capitals.put("Tyskland", "Berlin");
        capitals.put("Österrike", "Wien");
        capitals.put("Grekland", "Aten");
        capitals.put("Lettland", "Riga");

        while (true) {
            int randomIndex = random.nextInt(capitals.size());
            String randomKey = getRandomKey(capitals, randomIndex);
            String randomValue = getRandomValue(capitals, randomIndex);

            System.out.println(randomKey + "s huvudstad?");
            String guess = input.nextLine();

            if (guess.equalsIgnoreCase(randomValue)) {
                System.out.println("Rätt!");
                System.out.println();
            } else
                System.out.println("Fel, rätt svar är " + randomValue + ".\n");
        }

    }

    public static String getRandomValue(Map<String, String> map, int index) {
        return GetInfo.getAValueFromIndex(map, index);
    }

    public static String getRandomKey(Map<String, String> map, int index) {
        return GetInfo.getAKeyFromIndex(map, index);
    }

}
