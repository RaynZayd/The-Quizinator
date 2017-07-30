/*
This is a simple fun project I created as a success quiz. It uses basic input
and out constructs. And Determines if you'll be success or not. Don't take it serious
it's just for fun and to test certain code implementations. It takes your response and returns print 
statements to the screen.
 */
package thequizinator;

/**
 *
 * @author Rayn Zayd
 */
import java.util.Scanner;
public class TheQuizinator {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome To THE QUIZINATOR by Rayn Zayd");
        System.out.println("Please answer the following questions to discover your potential of being successful in life.");
        System.out.println("Simply type in YES or a NO. Make sure that ALL letters are CAPITAL");
        System.out.println("Q1: Do you know exactly what you desire in life?");
        Scanner scan = new Scanner(System.in);
        String answer1 = scan.nextLine();
        System.out.println("Q2: Have you got your goals on paper and do you think about them every morning and night before you sleep?");
        String answer2 = scan.nextLine();
        System.out.println("Q3: Are you now doing what is necessary to accomplish your goal(s)?");
        String answer3 = scan.nextLine();
        
        System.out.println("Here are your results!");
        
        if ("YES".equals(answer1)&& "YES".equals(answer2) || "YES".equals(answer3)){System.out.println("You're likely to be successful!");}else{ System.out.println("You possess low possibilities of being successful."); }
       
 
        
    }
    
}
    

       
