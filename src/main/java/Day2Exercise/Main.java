package Day2Exercise;
import java.util.Scanner;
public class Main {
    public static void main(String[] Strings) {

        //Fahrenheit to Celcius
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celcius =(( 5 * (fahrenheit - 32.0)) /9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celcius + " in Celcius");

        //Centimeter to Kilometer
        Scanner inputcm = new Scanner(System.in);

        System.out.print("Input cm: ");
        double cm = inputcm.nextDouble();

        double km = cm / 100000;
        System.out.println(cm + " cm equals to " + km + "km");


    }

}
