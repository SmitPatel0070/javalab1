/*

 * Name: Smit Patel
 * Title: Java lab 1
 * Student ID: 100846414

 */


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args)
    {        
        String[] game_members = {"Smit", "Yesha", "Hemi"};
        int togam = 2;
        int[][] results = new int[game_members.length][togam];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < console.Instance().toply; i++) {
            for (int j = 0; j < console.Instance().togam; j++) {


                

                try {

                    System.out.print("Please enter " + game_members[i] + "'s results for Game " + (j + 1) + ": ");
                    results[i][j] = sc.nextInt();
                    

                }

                catch (InputMismatchException ex)

                {

                    System.out.println("Error out of range! Input must be numeric value");
                    j = j - 1; 
                    sc.nextLine();

                }

            }

        }

        

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < game_members.length; i++) {
            output.append(String.format("Score Details for %s: %nGAME No 1: %5s%nGAME No 2: %5s%nAverage for %s: %s %n%n", game_members[i], results[i][0],results[i][1], game_members[i], ((double) (results[i][0] + results[i][1])) / 2));

        }

        System.out.println(output);

    }

}


