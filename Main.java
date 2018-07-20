import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Exercise 1
        System.out.println("It's a great day today?");

        System.out.print("What is your name?");
        Scanner inputname = new Scanner(System.in);
        String name = inputname.nextLine();


        System.out.println("Hello:" + name);

// Exercise 2

        System.out.print("Enter a number");
        Scanner my_scanner;

        my_scanner = new Scanner(System.in);

        int number = my_scanner.nextInt();

        System.out.print("Select another number");
        my_scanner = new Scanner(System.in);
        int number2 = my_scanner.nextInt();
        System.out.println("The sum of the number is:  " + (number + number2));

        System.out.println("The difference of the number is:  " + (number - number2));

//Excercise 3

        System.out.print("Enter balance");
        Scanner balance;

        balance= new Scanner(System.in);

        int number =
    }


}
