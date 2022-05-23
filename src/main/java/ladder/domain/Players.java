package ladder.domain;

import ladder.view.Output;

import java.util.List;
import java.util.Objects;

public class Players {
    private final List<Player> players;

    public Players(List<Player> players) {
        this.players = players;
    }

    public int size() {
        return this.players.size();
    }

    public void draw() {
        Output.print(" ".repeat(2));
        this.players.forEach(p -> Output.print(p.payload()));
        Output.print("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players1 = (Players) o;
        return Objects.equals(players, players1.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players);
    }
}
