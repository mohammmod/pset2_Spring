package at.refugeescode.pset2spring.pset2.controller;

import at.refugeescode.pset2spring.pset2.modal.Moves;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class JudgeTest {
    private Judge judge;
    private Moves move1;
    private Moves move2;

    @BeforeEach
    void initialize() {
        judge = new Judge();
        move1 = Mockito.mock(Moves.class);
        move2 = Mockito.mock(Moves.class);
    }


    @Test
    void judging() {

        Mockito.when(move1.getName()).thenReturn("Rock");
        Mockito.when(move2.getName()).thenReturn("Scissors");

        String judging = judge.judging(move1, move2);

        Assertions.assertEquals("Player1 is the winner", judging);

        Mockito.when(move1.getName()).thenReturn("Scissors");
        Mockito.when(move2.getName()).thenReturn("Paper");

        String judging1 = judge.judging(move1, move2);

        Assertions.assertEquals("Player1 is the winner", judging1);

        Mockito.when(move1.getName()).thenReturn("Paper");
        Mockito.when(move2.getName()).thenReturn("Rock");

        String judging2 = judge.judging(move1, move2);

        Assertions.assertEquals("Player1 is the winner", judging2);
    }
}