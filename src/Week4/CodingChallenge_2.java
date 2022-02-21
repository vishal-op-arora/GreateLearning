package Week4;

import java.util.Scanner;

class Main2{
    public int performAddition(int num1, int num2){
        return num1 + num2;
    }
}

public class CodingChallenge_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Main2 main = new Main2();
        int num1, num2, result;
        System.out.print("Enter num1 : ");
        num1 = scan.nextInt();
        System.out.print("Enter num1 : ");
        num2 = scan.nextInt();

        result = main.performAddition(num1, num2);
        System.out.println("Addition of two number is : " + result);

    }
}
