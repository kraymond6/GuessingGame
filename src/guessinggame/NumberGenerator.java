/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author Kallie
 */
public class NumberGenerator {
    private int lowRange;
    private int highRange;
    private int num;
    Random rand = new Random();
    public NumberGenerator(int lowRange, int highRange){
        this.lowRange = lowRange;
        this.highRange = highRange;
    }
    
    public int generateNumber(){
        // int randomNum = rand.nextInt((max - min) + 1) + min;
        num = rand.nextInt((highRange - lowRange) + 1) + lowRange;
        return num;
    }
    
    public int getAnswer(){
        return num;
    }
}
