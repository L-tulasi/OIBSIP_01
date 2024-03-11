//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.*;


public class Main {
    int Guess(int n,int l){
        Scanner sc=new Scanner(System.in);
        int num=0;
        int score=0;
        Random rand = new Random();


        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(1,100);
        System.out.println(" ");
        System.out.println("Let's Start with Level:"+l);
        System.out.println("Here you have "  +n+  " attempts");
        try {
            for (int i = 0; i < n; i++) {
                System.out.println(" ");
                System.out.println("attempt:" + (i + 1));
                System.out.println("please enter any number from 1 to 100");
                num = sc.nextInt();
                if (num >= 1 && num <= 100) {
                    if (rand_int1 == num) {
                        System.out.println("Matched,Congrats you guessed it Right!!");
                        rand_int1 = rand.nextInt(1, 100);
                        score = score + 1;
                    } else {
                        System.out.println("Not Matched!,Try Again");
                        if (rand_int1 > num) {
                            System.out.println("The number you entered is smaller");

                            System.out.println("Try entering Greater number than previous one");
                        } else if (rand_int1 < num) {
                            System.out.println("The number you entered is Greater");

                            System.out.println("Try entering Smaller number than previous one");
                        }
                    }
                } else
                    System.out.println("Please enter a number between 1 to 100");

            }
        }
        catch (InputMismatchException ex) {
            System.out.println("enter valid input...");
        }
        return score;

    }


   public static void main(String[] args)
    {
        // create instance of Random class
        System.out.println("Welcome to Number Guessing Game");
        Main m=new Main();
        int sum=0;
        int sco=0;
       sco= m.Guess(15,1);
       sum+=sco;
        System.out.println("Your Score in Level-1: "+sco);
        sco=m.Guess(10,2);
        sum+=sco;
        System.out.println("Your Score in Level-2: "+sco);
        sco=m.Guess(5,3);
        sum+=sco;
        System.out.println("Your Score in Level-3: "+sco);
        System.out.println("Your Total Score in the Game is: "+sum);




    }
    }
