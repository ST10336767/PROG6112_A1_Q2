/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1prog6112q2;

import java.util.Scanner;

/**
 *
 * @author Keaton
 */
public class Forwards extends Position{
    int total = 0;
    Scanner sc = new Scanner(System.in);

    public Forwards(String name, int timePlayed, int numGoals, int numAssists, int numMissedPens, int numOwnGoals, int card) {
        super(name, timePlayed, numGoals, numAssists, numMissedPens, numOwnGoals, card);
    }
    
    public void addPlayer() {
        total =0;
        System.out.print("Please enter the players name: ");
        name = sc.nextLine();
        System.out.println("Please enter the amount of time played: ");
        timePlayed = sc.nextInt();
        total += calcTime(timePlayed);
        System.out.println("Please enter in the amount of goals scored");
        numGoals = sc.nextInt();
        total += calcGoals(numGoals);
         System.out.println("Please enter the amount of assists made: ");
        numAssists = sc.nextInt();
        total += calcAssists(numAssists);
        System.out.println("Plesase enter in the amount of missed pens: ");
        numMissedPens = sc.nextInt();
        total += calcMissedPens(numMissedPens);
        System.out.println("Plesase enter in the amount of own goals scored: ");
        numOwnGoals = sc.nextInt();
        total += calcOwnGoals(numOwnGoals);
        total += calcCard();
        playerName.add(name);
        playerScore.add(total);
    }

    public int calcTime(int timePlayed) {

        if (timePlayed <= 60) {
            return 1;
        }
        return 2;
    }

    public int calcGoals(int numGoals) {
        
        return numGoals * 4;
    }

    public int calcAssists(int numAssists) {
        
        return numAssists * 3;
    }

    public int calcMissedPens(int numMissedPens) {
        
        return numMissedPens * -2;
    }

    public int calcOwnGoals(int numOwnGoals) {
        
        return numOwnGoals * -2;
    }

    public int calcCard() {
        System.out.println("Plesase select the correct option \n1) no card\n2)yellow card\n3)red card");
        card = sc.nextInt();

        switch (card) {
            case 1:
                return 0;
            case 2:
                return -1;
            case 3:
                return -3;
            default:
                System.out.println("Invalid Option");
                calcCard();
        }
        return 0;
    }    
}
