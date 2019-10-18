package foostour.app;

import java.util.HashSet;
import java.util.Set;

public class Scheduler {

    private static Set<Game> games = new HashSet<>();

    public static void addGame(Team t1, Team t2) {
        games.add(new Game(t1, t2));
    }

    public static void displayGames() {
        for (Game g : games) {
            System.out.println("Game: " + g.t1.name + " vs " + g.t2.name);
        }
    }
}
