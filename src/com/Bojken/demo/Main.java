package com.Bojken.demo;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String player1;
        String player2;
        int die;
        int die2;
        int rounds = 5;
        int Player1sum = 0;
        int Player2sum = 0;

        // Player1 - name
        System.out.println("Input player1's name");
        player1 = scan.nextLine();
        System.out.println("Player1's name is: " + player1);

        // Player2 - name
        System.out.println("Input player2's name");
        player2 = scan.nextLine();
        System.out.println("Player2's name is: " + player2);

        // Player1 turn
        System.out.println(player1 + " is throwing!");

        for (int i = 0; i < rounds; i++) {

            die = random.nextInt(6) + 1;
            System.out.println(die);

            Player1sum += die;
            System.out.println("Sum is: " + Player1sum);
        }

        // Player2 turn
        System.out.println(player2 + "is throwing!");

        for (int i = 0; i < rounds; i++) {
            die2 = random.nextInt(6) + 1;
            System.out.println(die2);

            Player2sum += die2;
            System.out.println("Sum is: " + Player2sum);
        }

        // The score
        System.out.println(player1 + " score: " + Player1sum);
        System.out.println(player2 + " score: " + Player2sum);

        if ( Player1sum > Player2sum) {
            System.out.println("The winner is: " + player1);

        }else if (Player1sum < Player2sum) {
            System.out.println("The winner is: " + player2);

        }else if (Player1sum == Player2sum) {
            System.out.println("The game ended in draw");
        }
    }
}
