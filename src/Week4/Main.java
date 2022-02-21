package Week4;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome
    public void checkPalindrome(int num)  {
        String numString = String.valueOf(num);
        String resString = "";
        for(int i = 0; i < numString.length(); i++){
            resString = numString.charAt(i) + resString;
        }
        if(numString.equals(resString))
            System.out.println(num + " is Palindrome number ");
        else
            System.out.println(num + " is not Palindrome number");
    }

    //function to printPattern
    public void printPattern(int num) {
        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    //function to check no is prime or not
    public void checkPrimeNumber(int num) {
        boolean isPrime = false;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = true;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is not prime number.\n");
        else
            System.out.println(num + " is prime number.\n");
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries(int num) {

        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        int print = 0;
        System.out.print(first+", "+ second);
        for (int i = 3; i <= num; i++){
            System.out.print(", ");
            print = first + second;
            first = second;
            second = print;
            System.out.print(print);
        }
        System.out.print("\n");
    }

//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.");


            System.out.println();
            System.out.print("Your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    choice = 0;
                    break;

                case 1: {
                    System.out.print("Enter Number : ");
                    obj.checkPalindrome(sc.nextInt());
                }
                break;

                case 2: {
                    System.out.print("Enter Number : ");
                    obj.printPattern(sc.nextInt());
                }
                break;

                case 3: {
                    System.out.print("Enter Number : ");
                    obj.checkPrimeNumber(sc.nextInt());
                }
                break;

                case 4: {
                    System.out.print("Enter Number : ");
                    obj.printFibonacciSeries(sc.nextInt());
                }
                break;

                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}