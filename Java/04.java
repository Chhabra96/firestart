import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
     // Taking input from User
        double studentGPA =3.2;
        String studentFirstName = "Priya";
        String studentLastName = "Chhabra";

        System.out.println(studentFirstName+" "+studentLastName + "  has a GPA of "+ studentGPA);

        System.out.println("What do you want to update it to?");

        Scanner input  = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println("Your GPA is " + studentGPA);
    }

}
