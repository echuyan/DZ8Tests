package tests;

import game.DiceImpl;
import org.junit.Assert;

public class Test01DiceImplBoundaries {


    public void testBoundaries() {
        DiceImpl dices = new DiceImpl();
        String scenario = "Тест выхода за пределы граничных значений";
        int[] actual = new int[6];
        int i= 0;
        for (i=0;i<6;i++) {actual[i]= dices.roll();}
        try {
            for (i=0;i<6;i++) {
            Assert.assertTrue(actual[i] >= 1 && actual[i] <= 6);}
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {

            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            System.err.println("Выпало значение за пределами интервала [1,6]: " +actual[i]);
        }
    }
}
