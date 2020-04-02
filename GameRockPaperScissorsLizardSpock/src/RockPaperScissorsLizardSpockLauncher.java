//  Game RockPaperScissorsLizardSpock Program

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Player {
    private int playerNum;
    private String weapon;

    Player(int playerNum) {
        this.playerNum = playerNum;
    }

    int getPlayerNum() {
        return playerNum;
    }

    String getWeapon() {
        return weapon;
    }

    String chooseWeapon() {
        Random rand = new Random();
        int mysteryNumber = rand.nextInt(5);
        switch (mysteryNumber) {
            case 0:
                weapon = "rock";
                break;
            case 1:
                weapon = "paper";
                break;
            case 2:
                weapon = "scissors";
                break;
            case 3:
                weapon = "lizard";
                break;
            case 4:
                weapon = "Spock";
                break;
            default:
                System.out.println("The player is fighting without a weapon!");
        }
        return weapon;
    }
}

class RockPaperScissorsLizardSpock {
    private long numRounds;
    private static Player player1;
    private static Player player2;
    private static StringBuilder player1Desc;
    private static StringBuilder player2Desc;
    private static StringBuilder roundDesc;
    private static StringBuilder winnerRoundDesc;
    private static StringBuilder tiesDesc;
    private static StringBuilder winsPlayer1Desc;
    private static StringBuilder winsPlayer2Desc;
    private static StringBuilder winnerGameDesc;
    private static byte winnerRound;
    private static long numTies;
    private static long numWinsPlayer1;
    private static long numWinsPlayer2;
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String LIZARD = "lizard";
    private static final String SPOCK = "Spock";
    private static final String plural = "s";

    RockPaperScissorsLizardSpock() {
        player1 = new Player(1);
        player2 = new Player(2);
        player1Desc = new StringBuilder();
        player2Desc = new StringBuilder();
        roundDesc = new StringBuilder();
        winnerRoundDesc = new StringBuilder();
        tiesDesc = new StringBuilder();
        winsPlayer1Desc = new StringBuilder();
        winsPlayer2Desc = new StringBuilder();
        winnerGameDesc = new StringBuilder();
    }

    void setNumRounds(long numRounds) {
        this.numRounds = numRounds;
    }

    long getNumRounds() {
        return numRounds;
    }

    private void newGame() {
        numTies = 0;
        numWinsPlayer1 = 0;
        numWinsPlayer2 = 0;
    }

    final void playRound() {
        // Select the player number, let him/her choose a weapon
        player1Desc.append("Player number ").append(player1.getPlayerNum()).append(" chooses ").append(player1.chooseWeapon());
        player2Desc.append("Player number ").append(player2.getPlayerNum()).append(" chooses ").append(player2.chooseWeapon());
        System.out.println(player1Desc);
        System.out.println(player2Desc);
        player1Desc.delete(0, player1Desc.length());
        player2Desc.delete(0, player2Desc.length());
        // Compare the weapons chosen by players, choose the winner of the round (unless they tied) and keep track of all the ties and wins
        if (player1.getWeapon().equals(player2.getWeapon())) {
            roundDesc.append("They tie!");
            winnerRound = 0;
            numTies++;
        } else if (player1.getWeapon().equals(ROCK) && player2.getWeapon().equals(PAPER)) {
            roundDesc.append("paper covers rock");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(ROCK) && player2.getWeapon().equals(SCISSORS)) {
            roundDesc.append("rock breaks scissors");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(ROCK) && player2.getWeapon().equals(LIZARD)) {
            roundDesc.append("rock crushes lizard");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(ROCK) && player2.getWeapon().equals(SPOCK)) {
            roundDesc.append("Spock vaporizes rock");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(PAPER) && player2.getWeapon().equals(ROCK)) {
            roundDesc.append("paper covers rock");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(PAPER) && player2.getWeapon().equals(SCISSORS)) {
            roundDesc.append("scissors cut paper");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(PAPER) && player2.getWeapon().equals(LIZARD)) {
            roundDesc.append("lizard eats paper");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(PAPER) && player2.getWeapon().equals(SPOCK)) {
            roundDesc.append("paper disproves Spock");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(SCISSORS) && player2.getWeapon().equals(ROCK)) {
            roundDesc.append("rock breaks scissors");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(SCISSORS) && player2.getWeapon().equals(PAPER)) {
            roundDesc.append("scissors cut paper");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(SCISSORS) && player2.getWeapon().equals(LIZARD)) {
            roundDesc.append("scissors decapitate lizard");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(SCISSORS) && player2.getWeapon().equals(SPOCK)) {
            roundDesc.append("Spock smashes (or melts) scissors");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(LIZARD) && player2.getWeapon().equals(ROCK)) {
            roundDesc.append("rock crushes lizard");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(LIZARD) && player2.getWeapon().equals(PAPER)) {
            roundDesc.append("lizard eats paper");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(LIZARD) && player2.getWeapon().equals(SCISSORS)) {
            roundDesc.append("scissors decapitate lizard");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(LIZARD) && player2.getWeapon().equals(SPOCK)) {
            roundDesc.append("lizard poisons Spock");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(SPOCK) && player2.getWeapon().equals(ROCK)) {
            roundDesc.append("Spock vaporizes rock");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(SPOCK) && player2.getWeapon().equals(PAPER)) {
            roundDesc.append("paper disproves Spock");
            winnerRound = 2;
            numWinsPlayer2++;
        } else if (player1.getWeapon().equals(SPOCK) && player2.getWeapon().equals(SCISSORS)) {
            roundDesc.append("Spock smashes (or melts) scissors");
            winnerRound = 1;
            numWinsPlayer1++;
        } else if (player1.getWeapon().equals(SPOCK) && player2.getWeapon().equals(LIZARD)) {
            roundDesc.append("lizard poisons Spock");
            winnerRound = 2;
            numWinsPlayer2++;
        }
        // Display the outcome of the round
        System.out.println(roundDesc);
        roundDesc.delete(0, roundDesc.length());
    }

    // Display the winner of the round (if anyone won)
    final void displayWinnerRound() {
        if (winnerRound > 0) {
            winnerRoundDesc.append("Player number ").append(winnerRound).append(" wins this round!");
            System.out.println(winnerRoundDesc);
            winnerRoundDesc.delete(0, winnerRoundDesc.length());
        }
        System.out.println();
    }

    // Display how many times players tied, who won (if anyone) and how many rounds
    final void displayRoundsResults() {
        if (numTies > 0) {
            tiesDesc.append("They tied ").append(numTies).append(" time");
            if (numTies > 1)
                tiesDesc.append(plural);
        }
        if (numWinsPlayer1 > 0) {
            winsPlayer1Desc.append("Player number ").append(player1.getPlayerNum()).append(" has won ").append(numWinsPlayer1).append(" time");
            if (numWinsPlayer1 > 1)
                winsPlayer1Desc.append(plural);
        }
        if (numWinsPlayer2 > 0) {
            winsPlayer2Desc.append("Player number ").append(player2.getPlayerNum()).append(" has won ").append(numWinsPlayer2).append(" time");
            if (numWinsPlayer2 > 1)
                winsPlayer2Desc.append(plural);
        }

        ArrayList<StringBuilder> results = new ArrayList<>();
        if (tiesDesc.length() > 0)
            results.add(tiesDesc);
        if (winsPlayer1Desc.length() > 0)
            results.add(winsPlayer1Desc);
        if (winsPlayer2Desc.length() > 0)
            results.add(winsPlayer2Desc);
        for (StringBuilder result : results) {
            System.out.println(result);
            if (result.length() > 0)
                result.delete(0, result.length());
        }
    }

    // Display the winner of the game (if anyone won)
    final void displayWinnerGame() {
        if (numWinsPlayer1 > numWinsPlayer2)
            winnerGameDesc.append("Player number ").append(player1.getPlayerNum());
        else if (numWinsPlayer2 > numWinsPlayer1)
            winnerGameDesc.append("Player number ").append(player2.getPlayerNum());
        else
            winnerGameDesc.append("No one");
        winnerGameDesc.append(" has won this game!\n");
        System.out.println(winnerGameDesc);
        winnerGameDesc.delete(0, winnerGameDesc.length());
        newGame();
    }
}


public class RockPaperScissorsLizardSpockLauncher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();

        // Loop to repeat the entry of the number until 0 or the negative number is entered
        do {
            // Prompt for scan
            System.out.print("How many rounds of the game would you like to play? (0 or less to exit) ");
            game.setNumRounds(scan.nextLong());
            // Play game or exit
            if (game.getNumRounds() > 0) {
                System.out.println();
                for (long i = 0; i < game.getNumRounds(); i++) {
                    game.playRound();
                    game.displayWinnerRound();
                }
                game.displayRoundsResults();
                game.displayWinnerGame();
            }
        } while (game.getNumRounds() > 0);
        scan.close();
    }
}
