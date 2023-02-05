import java.util.ArrayList;
import java.util.List;

public class GameAccountBasic {
    String UserName;
    double CurrentRating;
    int GamesCount;
    String result1 = "Winner";
    String result2 = "Defeat";
    List<BasicClass> list = new ArrayList();

    public GameAccountBasic(String userName, double currentRating) {
        UserName = userName;
        CurrentRating = currentRating;
    }

    public void WinGame(BasicClass game, GameAccountBasic opponentplayer) {
    }

    public void LoseGame(BasicClass game, GameAccountBasic opponentplayer) {

    }

    public void GetStats() {
        for (BasicClass g : list) {
            System.out.println(g + " ");
        }
    }
}
