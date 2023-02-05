public class GameAccountWinningStreak extends GameAccountBasic {
    public GameAccountWinningStreak(String userName, double currentRating) {
        super(userName, currentRating);
        this.UserName = userName;
        this.CurrentRating = currentRating;
    }
    int amountwingame = 0;

    public void WinGame(BasicClass game, GameAccountWinningStreak opponentplayer) throws Exception {
        game.WinGame(game, opponentplayer);
        this.CurrentRating += game.CurrentRating1;
        opponentplayer.CurrentRating -= game.CurrentRating2;
        GamesCount++;
        amountwingame++;
        if (game.rating < 0) {
            throw new Exception("Ставка на рейтинг не може бути у від'ємному значенні!!!");
        } else if (opponentplayer.CurrentRating < 1) {
            throw new Exception("Рейтинг ігрока : " + opponentplayer.UserName + " досягнув мінімального значення!!!");
        }
        if (amountwingame == 3) {
            int additional = (int) ((Math.random() * 20) + 90);
            this.CurrentRating += additional;
            amountwingame = 0;
        }
        list.add(new BasicClass(GamesCount, this.UserName, opponentplayer.UserName, result1, game.rating, this.CurrentRating, opponentplayer.CurrentRating));
    }

    public void LoseGame(BasicClass game, GameAccountWinningStreak opponentplayer) throws Exception {
        game.LoseGame(game, opponentplayer);
        this.CurrentRating -= game.CurrentRating1;
        opponentplayer.CurrentRating += game.CurrentRating2;
        GamesCount++;
        amountwingame++;
        if (game.rating < 0) {
            throw new Exception("Ставка на рейтинг не може бути у від'ємному значенні!!!");
        } else if (this.CurrentRating < 1) {
            throw new Exception("Рейтинг ігрока : " + this.UserName + " досягнув мінімального значення!!!");
        }
        if (amountwingame > 0) {
            amountwingame = 0;
        }
        list.add(new BasicClass(GamesCount, this.UserName, opponentplayer.UserName, result2, game.rating, this.CurrentRating, opponentplayer.CurrentRating));
    }
}
