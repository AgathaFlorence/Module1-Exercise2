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

        //Even or odd numbers
        Scanner inputnumber = new Scanner(System.in);

        System.out.print("Input number: ");
        double number = inputnumber.nextDouble();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        //search by word
        String string1 = "Hello world";
        String string2 = "ell";

        int index = string1.indexOf(string2);
        if (index == -1)
        {
          System.out.println("not found");  // Not found. What do you want to do?
        }
        else
        {
            String result = string1.substring(0, index) +
                    string1.substring(index + string2.length());
            System.out.println("Search result: " + result);
        }

        Scanner inputword = new Scanner(System.in);
        System.out.print("Input word: ");
        String str = inputword.nextLine(), reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}