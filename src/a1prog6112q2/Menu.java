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
public class Menu {

    private Scanner sc = new Scanner(System.in);
    Position pos = new Position("", 0,0,0,0,0,0);
    public void welcomeScreen() {
        System.out.println("Welcome to the FPL score calculator."
                + "\n--------------------------------------------------");
        menu();
    }

    public void menu() {
       
        int choice = 0, count = 0;
        while (choice != 4) {
            if (count < 11) {
                System.out.println("Please select an option:"
                        + "\n--------------------------------------------------"
                        + "\n(1) Add a player."
                        + "\n(2) Delete a player."
                        + "\n(3) Show points."
                        + "\n(4) Exit application.");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        count++;
                        pos.selectPlayer();
                        System.out.println("Player has been successfully added");
                        System.out.println("-------------------------------------------");
                        break;
                    case 2:
                        count--;
                        pos.deletePlayer();
                        System.out.println("Player has been successfully deleted.");
                        System.out.println("-------------------------------------------");
                        break;
                    case 3:
                        pos.printScore();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Please select an option:"
                        + "\n--------------------------------------------------"
                        + "\n(1) Delete a player."
                        + "\n(2) Show points."
                        + "\n(3) Exit application.");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        count--;
                        pos.deletePlayer();
                        break;
                    case 2:
                        pos.printScore();
                        break;
                    case 3:
                        System.exit(0);

                    default:
                        System.out.println("Invalid input.");
                }
            }
        }
    }
}
