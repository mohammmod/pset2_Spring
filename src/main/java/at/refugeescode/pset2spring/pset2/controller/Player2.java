package at.refugeescode.pset2spring.pset2.controller;

import at.refugeescode.pset2spring.pset2.controller.Players;
import at.refugeescode.pset2spring.pset2.controller.PossibleMove;
import at.refugeescode.pset2spring.pset2.modal.Moves;


import java.util.List;
import java.util.Random;

public class Player2 implements Players {
    @Override
    public Moves pickUpOneMove(PossibleMove oneMove) {
        return useMentalPowersToChooseTheRightCard(oneMove);
    }

    @Override
    public boolean wantToPlayAgain() {
        return true;
    }

    private Moves useMentalPowersToChooseTheRightCard(PossibleMove oneMove) {
        Random rand = new Random();
        List<Moves> cards = oneMove.getMoves();
        int randomIndex = rand.nextInt(cards.size());
        return cards.get(randomIndex);
    }
}
