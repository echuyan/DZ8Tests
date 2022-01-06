package tests.mocks;

import game.GameWinnerPrinter;
import game.Player;

import java.io.FileWriter;
import java.io.IOException;

public class GameWinnerPrinterMock  implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        try(FileWriter writer = new FileWriter("./src/tests/winner.txt", false))
        {
            writer.write(winner.getName());
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }
}

