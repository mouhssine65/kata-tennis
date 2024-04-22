public class TennisGame {
    TennisScore scoreComputer = new TennisScore();
    public void score(String input) {
        for (char c : input.toCharArray()) {
            if (c == 'A') {
                scoreComputer.playerAScores();
            } else if (c == 'B') {
                scoreComputer.playerBScores();
            }
            scoreComputer.printScore();
            if (scoreComputer.isEndGame()) break;
        }
    }
}