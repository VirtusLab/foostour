package foostour.app;

import java.util.*;

public class FoosApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Foosball Tournament!");

        //REMEMBER to change when there are more players!
        Player[] players = new Player[8];
        for (int i = 0; i < 8; i++) {
            Player j = new Player();
            int[] k = {0, 1, 2};
            j.name = "Player " + (i+1);
            j.preferredPosition = k[new Random().nextInt(k.length)];
            players[i] = j;
        }

        for (int i = 0; i < 8; ++i) {
            Players.addPlayer(players[i]);
        }

        Set<Player> players1 = new HashSet<>();
        for (Player p : Players.players) {
            players1.add(p);
        }

        List<Player> actualPlayers = new ArrayList<>(players1);
        int total = actualPlayers.size();
        if (total % 2 == 0) --total;
        for (int i = 0; i < total; i+=2) {
            Team t = new Team("Team " + (i+1));
            t.player1 = actualPlayers.get(i);
            t.player2 = actualPlayers.get(i+1);
            Players.add(t);
        }

        ///////////////// Displaying the teams here:
        // IMPORTANT!! Check if correct before playing games!!!!
        for (Team t : Players.teams) {
            System.out.println(t.name + ": " + t.player1.name + ", " + t.player2.name);
        }

        // Drawing team starts here...
        while (!Players.teams.isEmpty()) {
            Team t1 = Players.teams.remove(new Random().nextInt(Players.teams.size()));
            if (!Players.teams.isEmpty()) {
                Team t2 = Players.teams.remove(new Random().nextInt(Players.teams.size()));
                Scheduler.addGame(t1, t2);
            }
        }

        Scheduler.displayGames();
    }
}
