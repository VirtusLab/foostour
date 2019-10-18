package foostour.app;

import java.util.ArrayList;
import java.util.List;

public class Players {

    static List<Player> players = new ArrayList<>();
    static List<Team> teams = new ArrayList<>();

    public static void addPlayer(Player player) {
        players.add(player);
    }

    public static void add(Team t) {
        teams.add(t);
    }
}
