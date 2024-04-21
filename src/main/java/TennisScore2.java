public class TennisScore2 {


    private int scoreA = 0;
    private int scoreB = 0;
    private boolean endGame = false;

    public void playerAScores() {
        scoreA++;
    }

    public void playerBScores() {
        scoreB++;
    }

    //ABABABAB BB
    public void printScore() {
        if (isGameOver()) {
            printWinner();
            this.endGame = true;
        } else if (isDeuce()) {
            scoreA--;
            scoreB--;
            System.out.println("Deuce");
        } else {
            System.out.format("Player A: %s / Player B: %s%n", formatScore(scoreA), formatScore(scoreB));
        }
    }

    public boolean isGameOver() {
        return (scoreA == 5 || scoreB == 5) && Math.abs(scoreA - scoreB) >= 2;
    }

    public boolean isDeuce() {
        return scoreA == 4 && scoreA == scoreB;
    }

    private void printWinner() {
        if (scoreA > scoreB) {
            System.out.println("Player A wins the game");
        } else {
            System.out.println("Player B wins the game");
        }
    }


    public String formatScore(int score) {
        return switch (score) {
            case 0 -> "0";
            case 1 -> "15";
            case 2 -> "30";
            case 3 -> "40";
            case 4 -> "Advantage";
            default -> throw new IllegalStateException("Unexpected value: " + score);
        };
    }

    public boolean isEndGame() {
        return endGame;
    }

    public int getScoreB() {
        return scoreB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }
}