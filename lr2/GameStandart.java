public class GameStandart extends BasicClass {
    public void WinGame(BasicClass rating1, GameAccountBasic opponentplayer) {
        int rating_result = (int) ((rating1.search_rating() * 20) + 90);
        rating = rating_result;
        CurrentRating1 += rating_result;
        CurrentRating2 += rating_result;
    }

    public void LoseGame(BasicClass rating1, GameAccountBasic opponentplayer) {
        int rating_result = (int) ((rating1.search_rating() * 20) + 90);
        rating = rating_result;
        CurrentRating1 += rating_result;
        CurrentRating2 += rating_result;
    }
}
