public class Start {
    public static void main(String[] args) throws Exception {
        GameAccountStandart b = new GameAccountStandart("Roma", 100);
        GameAccountStandart b2 = new GameAccountStandart("Denys", 200);
        GameAccountTwiceLess a = new GameAccountTwiceLess("Katya", 300);
        GameAccountTwiceLess a2 = new GameAccountTwiceLess("Dasha", 150);
        GameAccountWinningStreak c = new GameAccountWinningStreak("Vasya", 200);
        GameAccountWinningStreak c2 = new GameAccountWinningStreak("Oleg", 200);
        b.WinGame(new GameStandart(), b2);
        b.LoseGame(new GameStandart(),b2);
//        a.WinGame(new GameStandart(), a2);
//        a.LoseGame(new GameStandart(),a2);
//        c.WinGame(new GameStandart(), c2);
//        c.LoseGame(new GameOnePlayOnRating(), c2);
//        b2.WinGame(new GameStandart(), b);
//        b2.WinGame(new GameStandart(), b);
        b.GetStats();
    }
}