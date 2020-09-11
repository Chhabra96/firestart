import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*Syntax error can cause your program to fail before it is run
         Logical error deals with the logic of a program.When a program has logical bug
         ,it does't act as the user expects
         */

        System.out.println("Let's calculate the area of Triangle");
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the Triangle (in inches).");
        double base = input.nextDouble();

        while(base <= 0){
            System.out.println("That's invalid.Please input the base of the Triangle (in inches)");
            base =input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches)");
        double height =input.nextDouble();

        while (height <= 0){
            System.out.println("That's invalid.Please input the base of the Triangle (in inches)");
            base = input.nextDouble();
        }
            double area = (base*height)/2;
            System.out.println("The area is "+area);

    }

}
