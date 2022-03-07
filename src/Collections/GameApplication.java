package Collections;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

public class GameApplication {
    public static void print(ArrayList<Games> s)
    {
        for (Games game : s
        ) {
            System.out.println(game.toString());
        }
    };
    public static void main(String[] args) {
        Games game1 = new Games("FF15", Genre.RPG, 49.99, 90000000);
        Games game2 = new Games("Call of Duty {insert number here}", Genre.ACTION, 79.99, 975500000);
        Games game3 = new Games("Farming Simulator 2022", Genre.SIMULATION, 29.99, 565459996);
        Games game4 = new Games("Elden Ring", Genre.ADVENTURE, 59.99, 999999999);
        ArrayList<Games> gameLibrary = new ArrayList<>();
        gameLibrary.add(game1);
        gameLibrary.add(game2);
        gameLibrary.add(game3);
        gameLibrary.add(game4);
        print(gameLibrary);
        gameLibrary.remove(2);
        System.out.println();
        System.out.println("REMOVED GAME2");
        print(gameLibrary);
        gameLibrary.sort(new PriceComparator());
        System.out.println();
        System.out.println("SORTED BY PRICE ASCENDING");
        print(gameLibrary);
        gameLibrary.sort(new PriceComparator().reversed());
        System.out.println();
        System.out.println("SORTED BY PRICE DESCENDING");
        print(gameLibrary);

    }
}
