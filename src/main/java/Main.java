public class Main {
    public static void main(String[] args) {
        TennisScore2 scoreComputer = new TennisScore2();
        String input = "ABABABABBB";

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

