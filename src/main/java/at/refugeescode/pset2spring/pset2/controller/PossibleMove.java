package at.refugeescode.pset2spring.pset2.controller;

import at.refugeescode.pset2spring.pset2.modal.Moves;
import at.refugeescode.pset2spring.pset2.modal.Paper;
import at.refugeescode.pset2spring.pset2.modal.Rock;
import at.refugeescode.pset2spring.pset2.modal.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PossibleMove {
    private List<Moves> moves;
    public PossibleMove(){
        moves = Stream.of(
                new Rock(),
                new Scissors(),
                new Paper()
        ).collect(Collectors.toList());

    }
    public List<Moves> getMoves(){
        return new ArrayList<>(moves);
    }
}
