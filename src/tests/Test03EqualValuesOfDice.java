package tests;

import game.Game;
import game.Player;
import org.junit.Assert;
import tests.mocks.GameWinnerPrinterMock;
import tests.mocks.*;

import java.io.File;
import java.util.Scanner;

public class Test03EqualValuesOfDice {


    public void testEqualValues() {
        //используем мок для класса броска костей. выпадают всегда одинаковые значения
        equalDice dices = new equalDice();
        String scenario = "Тест на проверку поведения при одинаковом значении у обоих игроков";

        //используем мок для класса вывода имени победителя. будем писать его имя в файл
        GameWinnerPrinterMock winnerPrinter = new GameWinnerPrinterMock();
        Game game = new Game(dices, winnerPrinter);

        try {
            game.playGame(new Player("Вася"), new Player("Антон"));
            Scanner scanner = new Scanner(new File("./src/tests/winner.txt"));
            Assert.assertTrue(scanner.next()!="Вася" && scanner.next()!="Антон" );
            System.out.printf("\"%s\" passed %n", scenario);
        }

         catch (Throwable e) {

            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            System.err.println("Некорректное поведение программы при одинаковом значении у обоих игроков");
          }
    }
}
