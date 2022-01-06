package tests;

import game.*;
import org.junit.Assert;
import tests.mocks.GameWinnerPrinterMock;

import java.io.File;
import java.util.Scanner;

public class Test04TheSamePlayer {


    public void testTheSamePlayer() {
        String scenario = "Тест на проверку поведения при передаче одного и того же игрока";
        Dice dice = new DiceImpl();
        //используем мок для класса вывода имени победителя. будем писать его имя в файл
        GameWinnerPrinterMock winnerPrinter = new GameWinnerPrinterMock();

        Game game = new Game(dice, winnerPrinter);
        Player player1 = new Player("Иван");

        try {
            game.playGame(player1,player1);
            Scanner scanner = new Scanner(new File("./src/tests/winner.txt"));
            System.out.println("Система определила победителя: "+scanner.next());
            Assert.assertTrue(scanner.next()!=player1.getName());
            System.out.printf("\"%s\" passed %n", scenario);
        }

         catch (Throwable e) {

            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            System.err.println("Некорректное поведение программы при передаче одного игрока в обоих параметрах");
          }
    }
}
