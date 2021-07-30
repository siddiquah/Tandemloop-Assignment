import java.util.Scanner;

public class Calculator {
    //Problem 1 :
    //Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
    //Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
    //Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string

    public static void main(String[] args) {
        double input1, input2;
        double result;
        String operator = "";

        System.out.println("Simple JAVA Calculator :D");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose one operator : \n + \n - \n * \n /");
        operator = String.valueOf(sc.next().charAt(0));
        System.out.println("You have chosen " + operator + " operator.");
        System.out.println("");

        System.out.println("Please Enter the first number :");
        input1 = sc.nextDouble();
        System.out.println("You have chosen " + input1 + " as your first number.");
        System.out.println("");

        System.out.println("Please Enter the second number :");
        input2 = sc.nextDouble();
        System.out.println("You have chosen " + input2 + " as your second number.");
        System.out.println("");

        switch(operator) {
            case "+":
                result = input1+input2;
                System.out.print("The result is : " + result);
                break;

            case "-":
                result = input1-input2;
                System.out.print("The result is : " + result);
                break;

            case "*":
                result = input1*input2;
                System.out.print("The result is : " + result);
                break;

            case "/":
                result = input1/input2;
                System.out.print("The result is : " + result);
                break;

            default:
                System.out.println("You have entered an invalid Operator. Please try again with the given operators only.");
        }
    }
}

//This problem can be done with InputStreamReader as well as Scanner class or with switch statement & if else.
//I have used scanner class and switch statement.
