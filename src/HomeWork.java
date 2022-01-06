import tests.Test01DiceImplBoundaries;
import tests.Test02CheckWinner;
import tests.Test03EqualValuesOfDice;
import tests.Test04TheSamePlayer;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");

        new Test01DiceImplBoundaries().testBoundaries();
        System.out.println("\n\n----------------------\n\n");

        new Test02CheckWinner().testIsWinnerCorrect();
        System.out.println("\n\n----------------------\n\n");

        new Test03EqualValuesOfDice().testEqualValues();
        System.out.println("\n\n----------------------\n\n");

        new Test04TheSamePlayer().testTheSamePlayer();
        System.out.println("\n\n----------------------\n\n");

    }


    
}