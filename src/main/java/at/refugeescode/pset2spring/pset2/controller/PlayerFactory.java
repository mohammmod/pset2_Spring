package at.refugeescode.pset2spring.pset2.controller;


import at.refugeescode.pset2spring.pset2.controller.Player1;
import at.refugeescode.pset2spring.pset2.controller.Player2;
import at.refugeescode.pset2spring.pset2.controller.Players;

public class PlayerFactory {
    public Players getPlayer1(){
        return new Player2();
    }
    public Players getPlayer2(){
        return new Player1();
    }

}
