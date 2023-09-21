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
public class GoalKeepers extends Position {

    int numShotsSaved, numPensSaved, numGoalsConceded, cleanSheet, total = 0;
    Scanner sc = new Scanner(System.in);
    

    public GoalKeepers(int cleanSheet, int numShotsSaved, int numPensSaved, int numGoalsConceded, String name, int timePlayed, int numGoals, int numAssists, int numMissedPens, int numOwnGoals, int card) {
        super(name, timePlayed, numGoals, numAssists, numMissedPens, numOwnGoals, card);
        this.cleanSheet = cleanSheet;
        this.numShotsSaved = numShotsSaved;
        this.numPensSaved = numPensSaved;
        this.numGoalsConceded = numGoalsConceded;
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
        System.out.println("Did your player keep a clean sheet please enter 1 for yes and 2 for no: ");
        cleanSheet = sc.nextInt();
        total += calcCleanSheet(cleanSheet);
        System.out.println("Plesase enter in the amount of shots saved: ");
        numShotsSaved = sc.nextInt();
        total += calcShotsSaved(numShotsSaved);
        System.out.println("Please enter in the amount of pens saved: ");
        numPensSaved = sc.nextInt();
        total += calcPensSaved(numPensSaved);
        System.out.println("Please enter in the amount of goals conceded: ");
        numGoalsConceded = sc.nextInt();
        total += calcGoalsConceded(numGoalsConceded);
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
        
        return numGoals * 6;
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

    public int calcCleanSheet(int cleanSheet) {
        
        if (cleanSheet == 1) {
            return 4;
        }
        return 0;
    }

    public int calcShotsSaved(int numShotsSaved) {
        int temp;
        
        temp = numShotsSaved / 3;
        return temp;
    }
    
    public int calcPensSaved(int numPensSaved){
        
        return numPensSaved * 5;
    }
    
    public int calcGoalsConceded(int numGoalsConceded){
        int temp;
        
        temp = numGoalsConceded / 2;
        return temp * -1;
    }
}
