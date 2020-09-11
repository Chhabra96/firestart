import java.util.Scanner;

//Functions in Java

public class Main {
    // defining the functions
    public static void announcedDeveloperTeaTime(){
        System.out.println("Waiting for developers tea time ...");
        System.out.println("Type in a random word and Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time");
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to your new job");
        // calling the function
        announcedDeveloperTeaTime();

        System.out.println("Write Code");
        System.out.println("Review  Code");

        announcedDeveloperTeaTime();
    }

}
