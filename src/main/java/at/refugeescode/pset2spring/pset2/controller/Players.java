package at.refugeescode.pset2spring.pset2.controller;


import at.refugeescode.pset2spring.pset2.modal.Moves;


public interface Players {
    Moves pickUpOneMove(PossibleMove oneMove);
    boolean wantToPlayAgain();
}
