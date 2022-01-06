package tests;

import game.*;
import org.junit.Assert;
import tests.mocks.*;

import java.io.File;
import java.util.Scanner;

public class Test02CheckWinner {


    public void testIsWinnerCorrect() {
        //используем мок для класса броска костей. у последнего игрока всегда значение больше
        preDefinedDice dices = new preDefinedDice();
        String scenario = "Тест на проверку корректности определения победителя";

        //используем мок для класса вывода имени победителя. будем писать его имя в файл
        GameWinnerPrinterMock winnerPrinter = new GameWinnerPrinterMock();
        Game game = new Game(dices, winnerPrinter);

        try {
            game.playGame(new Player("Вася"), new Player("Игорь"));
            Scanner scanner = new Scanner(new File("./src/tests/winner.txt"));
            Assert.assertEquals("Победитель определен неверно","Игорь",scanner.next());
            System.out.printf("\"%s\" passed %n", scenario);
        }

         catch (Throwable e) {

            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
          }
    }
}
