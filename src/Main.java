
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // compound interest calculator

        Scanner scanner = new Scanner(System.in);
    /*
        System.out.print("enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.print("enter interest rate (in %): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("enter the # of times compounded per year: ");
        int timesCompounded = scanner.nextInt();

        System.out.print("enter the # of years: ");
        int years = scanner.nextInt();

        double amount = principal * (Math.pow( (1 + (interestRate / timesCompounded)) ,(timesCompounded * years)));

        System.out.printf("$%.2f ", amount);
    */
        // weight conversion program

    /*
        double weight;
        double newWeight;
        int choice;

        System.out.println("weight conversion program");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.print("chose an option: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("the new weight in kgs is %.2f", newWeight);
        }
        else if (choice == 2) {
            System.out.println("enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("the new weight in lbs is %.2f", newWeight);
        }
        else {
            System.out.println("that was not a valid choice");
        }
    */
        //temperature convertor
    /*
        double temp;
        double newTemp;
        String unit;

        System.out.print("enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("convert to celsius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9);

        System.out.printf("the new temperature is %.2f%s", newTemp, unit);
    */

        //simple calculator
    /*
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("enter an operator (+, -, *, /, ^ ): ");
        operator = scanner.next().charAt(0);

        System.out.print("enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("cannot divide by 0");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1 , num2);
            default -> {
                System.out.println("Invalid Operator");
                validOperator = false;
            }
        }
        if (validOperator){
            System.out.println(result);
        }
    */
        // validating username

    /*
        String userName;
        System.out.print("enter your username: ");
        userName = scanner.nextLine();

        if ( userName.length() < 4 || userName.length() > 12){
            System.out.println("username must be  between 4-12 characters");
        }
        else if (userName.contains(" ") || userName.contains("_")) {
            System.out.println("username must not contain spaces or underscores");
        }
        else {
            System.out.println("welcome" + userName);
        }
        */

        //number guessing game

 /*       Random random = new Random();

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,101);


        System.out.println("number guessing game");
        System.out.println("guess a number between 1-100: ");

        do {
            System.out.print("enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("too low, try again");
            }
            else if (guess > randomNumber) {
                System.out.println("too high, try again");
            }
            else System.out.println("correct, the number was" + randomNumber);
        }while (guess != randomNumber);

        System.out.println("number of attempts was: " + attempts);
*/
        //new year countdown using for loop

 /*       for (int i = 10; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("happy new year");
*/

        //java banking program (beginners)

        double balance;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("****************");
            System.out.println("banking program");
            System.out.println("****************");
            System.out.println("1. show balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. exit");
            System.out.println("****************");

            System.out.print("enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> System.out.println("show balance");
                case 2 -> System.out.println("deposit");
                case 3 -> System.out.println("withdraw");
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice");

            }

        }
        scanner.close();
    }
    static void showBalance(double balance)

}
