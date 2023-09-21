/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1prog6112q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Keaton
 */
public class Position {

    static ArrayList<String> playerName = new ArrayList<>();
    static ArrayList<Integer> playerScore = new ArrayList<>();
    String name;
    int timePlayed, numGoals, numAssists, numMissedPens, numOwnGoals, card;

    Scanner sc = new Scanner(System.in);
//    GoalKeepers gk = new GoalKeepers(0, 0, 0, 0, "", 0, 0, 0, 0, 0, 0);
//    Defenders df = new Defenders(0, 0, "", 0, 0, 0, 0, 0, 0);
//    Midfielders mf = new Midfielders(0, "", 0, 0, 0, 0, 0, 0);
//    Forwards fw = new Forwards("", 0, 0, 0, 0, 0, 0);

    public Position(String name, int timePlayed, int numGoals, int numAssists, int numMissedPens, int numOwnGoals, int card) {

        this.name = name;
        this.timePlayed = timePlayed;
        this.numGoals = numGoals;
        this.numAssists = numAssists;
        this.numMissedPens = numMissedPens;
        this.numOwnGoals = numOwnGoals;
        this.card = card;
    }

    public void selectPlayer() {
        GoalKeepers gk = new GoalKeepers(0, 0, 0, 0, "", 0, 0, 0, 0, 0, 0);
        Defenders df = new Defenders(0, 0, "", 0, 0, 0, 0, 0, 0);
        Midfielders mf = new Midfielders(0, "", 0, 0, 0, 0, 0, 0);
        Forwards fw = new Forwards("", 0, 0, 0, 0, 0, 0);
        int pos;
        System.out.println("What position does the player fall under?"
                + "\n--------------------------------------------------"
                + "\n(1) Goalkeeper"
                + "\n(2) Defender"
                + "\n(3) Midfielder"
                + "\n(4) Forward");

        pos = sc.nextInt();
        switch (pos) {
            case 1:
                gk.addPlayer();
                break;
            case 2:
                df.addPlayer();
                break;
            case 3:
                mf.addPlayer();
                break;
            case 4:
                fw.addPlayer();
                break;
            default:
                System.out.println("Invalid input.");
                selectPlayer();
        }

    }

    public void deletePlayer() {
        String tempName;
        System.out.println("Please enter the players name: ");
        tempName = sc.next();
        for (int i = 0; i < playerName.size(); i++) {
            if (playerName.get(i).matches(tempName)) {
                playerName.remove(i);
                playerScore.remove(i);
            }
        }
    }

    public void printScore() {
        int totalScore = 0;
        String tempName;
        int tempScore;

        for (int i = 0; i < playerScore.size() - 1; i++) {
            for (int j = 0; j < playerScore.size()-i-1; j++) {

                if (playerScore.get(j) < playerScore.get(j + 1)) {
                    tempScore = playerScore.get(j);
                    tempName = playerName.get(j);
                    playerScore.set(j, playerScore.get(j + 1));
                    playerName.set(j, playerName.get(j + 1));
                    playerScore.set(j + 1, tempScore);
                    playerName.set(j + 1, tempName);
                }
            }
        }

        System.out.println("         Your teams score");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < playerName.size(); i++) {
            System.out.println(playerName.get(i) + ": " + playerScore.get(i));
            totalScore += playerScore.get(i);
        }
    }

}
