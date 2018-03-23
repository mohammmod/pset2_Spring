package at.refugeescode.pset2spring.pset2.controller;


import at.refugeescode.pset2spring.pset2.modal.Moves;

import java.util.HashMap;

public class Judge {
    public String judging(Moves move1, Moves move2) {

        String moveOne = move1.getName();
        String moveTwo = move2.getName();

        String move1Opposite = getOpposite(move1);
        String move2Opposite = getOpposite(move2);

        System.out.println(move1Opposite);

        if (move1Opposite.equalsIgnoreCase(moveTwo)) {
            return "Player1 is the winner";
        } else if (move2Opposite.equalsIgnoreCase(moveOne)) {
            return "Player2 is the winner";
        } else {
            return "it is a tie";
        }

//        if (moveOne.equalsIgnoreCase(move2Opposite)) {
//            return "Player1 is the winner";
//        } else if (moveTwo.equalsIgnoreCase(move1Opposite)) {
//            return "Player2 is the winner";
//        } else {
//            return "it is a tie";
//        }

    }
        private String getOpposite (Moves move){
            HashMap<String, String> oppositemove = new HashMap<>();
            oppositemove.put("Rock", "Scissors");
            oppositemove.put("Scissors", "Paper");
            oppositemove.put("Paper", "Rock");

            return oppositemove.get(move.getName());
        }
    }
