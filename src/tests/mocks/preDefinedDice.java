package tests.mocks;

import game.Dice;

public class preDefinedDice implements Dice {
    private int counter;

   public preDefinedDice() {
       counter=0;
   }

    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        counter++;
        return counter;
    }
}
