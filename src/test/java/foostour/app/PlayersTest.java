package foostour.app;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayersTest {

    @Test
    public void testAddPlayer() {
        Player player = new Player();

        Players.addPlayer(player);

        List<Player> players = new ArrayList<>();
        players.add(player);
        assertEquals(Players.players, players);
    }
}
