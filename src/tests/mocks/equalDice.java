package tests.mocks;

import game.Dice;

public class equalDice implements Dice {



    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

        return 1;
    }
}
