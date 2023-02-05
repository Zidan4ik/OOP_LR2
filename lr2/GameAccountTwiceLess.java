public class GameAccountTwiceLess extends GameAccountBasic {
    public GameAccountTwiceLess(String userName, double currentRating) {
        super(userName, currentRating);
        UserName = userName;
        CurrentRating = currentRating;
    }

    public void WinGame(BasicClass game, GameAccountTwiceLess opponentplayer) throws Exception {
        game.WinGame(game, opponentplayer);
        this.CurrentRating += (game.CurrentRating1) / 2;
        opponentplayer.CurrentRating -= (game.CurrentRating2) / 2;
        GamesCount++;
        if (game.rating < 0) {
            throw new Exception("Ставка на рейтинг не може бути у від'ємному значенні!!!");
        } else if (opponentplayer.CurrentRating < 1) {
            throw new Exception("Рейтинг ігрока : " + opponentplayer.UserName + " досягнув мінімального значення!!!");
        }
        list.add(new BasicClass(GamesCount, this.UserName, opponentplayer.UserName, result1, game.rating, this.CurrentRating, opponentplayer.CurrentRating));
    }

    public void LoseGame(BasicClass game, GameAccountTwiceLess opponentplayer) throws Exception {
        game.LoseGame(game, opponentplayer);
        this.CurrentRating -= (game.CurrentRating1) / 2;
        opponentplayer.CurrentRating += (game.CurrentRating2) / 2;
        GamesCount++;
        if (game.rating < 0) {
            throw new Exception("Ставка на рейтинг не може бути у від'ємному значенні!!!");
        } else if (this.CurrentRating < 1) {
            throw new Exception("Рейтинг ігрока : " + this.UserName + " досягнув мінімального значення!!!");
        }
        list.add(new BasicClass(GamesCount, this.UserName, opponentplayer.UserName, result2, game.rating, this.CurrentRating, opponentplayer.CurrentRating));
    }
}
