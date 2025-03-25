package org.davydchenkov;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontiHollParadox {

    public static void main(String[] args) {
        Random random = new Random();
        int doors = 3;
        int count = 100;

        int winner = 0;
        int looser = 0;

        Map<Integer, String> winnerDoorResult = new HashMap<>();
        Map<Integer, String> failureDoorResult = new HashMap<>();

        for (int i = 1; i < count+1; i++) {

            int selectDoor = random.nextInt(doors);
            int winDoor = random.nextInt(doors);

            if (selectDoor == winDoor) {
                winnerDoorResult.put(i, "С " + i + " попытки Игрок открыл победную дверь");
                winner++;
            }
            else{
                failureDoorResult.put(i, "С " + i + " попытки Игрок ошибся в выборе");
                looser++;
            }
        }

        System.out.println(winner);
        for(Map.Entry<Integer, String>  win : winnerDoorResult.entrySet()){
            System.out.println("Попытка " + win.getKey() + ":" + win.getValue());
        }
        System.out.println(looser);
        for(Map.Entry<Integer, String>  loose : winnerDoorResult.entrySet()){
            System.out.println("Попытка " + loose.getKey() + ":" + loose.getValue());
        }
    }
}
