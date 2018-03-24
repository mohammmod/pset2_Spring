package at.refugeescode.pset2spring.pset2.controller;


import at.refugeescode.pset2spring.pset2.modal.Moves;
import at.refugeescode.pset2spring.pset2.view.Displayer;
import org.springframework.stereotype.Component;

@Component
public class RockScissorsPaper {
    PlayerFactory players = new PlayerFactory();
    Displayer displayer = new Displayer();
    public void play() {
        displayer.displayWelcomeMassage();

        do {
            PossibleMove move = new PossibleMove();

            displayer.displayThechoices(move);

            Players player1 = players.getPlayer1();

            Players player2 = players.getPlayer2();

            Moves move1 = player1.pickUpOneMove(move);

            Moves move2 = player2.pickUpOneMove(move);

            displayer.displayMovements(move2, move1);

            Judge judge = new Judge();

            String theWinner = judge.judging(move1, move2);

            displayer.displayTheWiner(theWinner);


        }while (players.getPlayer1().wantToPlayAgain()&&players.getPlayer2().wantToPlayAgain());
    }
}
