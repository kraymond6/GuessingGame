/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Kallie
 */
public class GamePlay {
    int answer;
    int guess;
    String msg;
    public GamePlay(int answer){
     this.answer = answer;   
    }
    
    public String playGame(int guess){
        this.guess = guess;
        
        if (guess == answer){
            msg = "You win!";
        }
        else if (guess > answer){
            msg = "Too high!";
        }
        else {
            msg = "Too low!";
        }
        return msg;
    }
}
