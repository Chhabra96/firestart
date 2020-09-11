import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String question = "What is the capital of France?";
        String  choiceOne = "Lyon";
        String  choicetwo = "Paris";
        String choicethree = " Grenoble";

        String correctanswer = choicetwo;

        System.out.println(question);

        System.out.println("Choose one of the following:" + choiceOne + " ," + choicetwo + " , and "+ choicethree);

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if(correctanswer.equals(input)){
            System.out.println("Congratulations :)");

        }else{
            System.out.println("You are incorrect. The correct is " + correctanswer);
        }
    }

}
