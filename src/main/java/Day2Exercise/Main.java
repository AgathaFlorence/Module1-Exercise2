package Day2Exercise;
import java.util.Scanner;
public class Main {
    public static void main(String[] Strings) {

        //Fahrenheit to Celcius
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celcius =(( 5 * (fahrenheit - 32.0)) /9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celcius + " in Celcius");}




}
