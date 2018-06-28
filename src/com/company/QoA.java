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

        int counter = 0;
        while (true) {
            int randomIndex = random.nextInt(capitals.size());
            String randomKey = getRandomKey(capitals, randomIndex);
            String randomValue = getRandomValue(capitals, randomIndex);

            System.out.println(randomKey + "s huvudstad?");
            String guess = input.nextLine();

            if (guess.equalsIgnoreCase(randomValue)) {
                counter++;
                System.out.println("Rätt!\nAntal rätt: " + counter);
                System.out.println();
            } else
                System.out.println("Fel, rätt svar är " + randomValue + ".\nAntal rätt: " + counter + '\n');
        }

    }

    public static String getRandomValue(Map<String, String> map, int index) {
        GetInfo getInfo = new GetInfo();
        return getInfo.getAValueFromIndex(map, index);
    }

    public static String getRandomKey(Map<String, String> map, int index) {
        GetInfo getInfo = new GetInfo();
        return getInfo.getAKeyFromIndex(map, index);
    }

}
