
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        // compound interest calculator


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
/*
        double balance = 0;
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
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("invalid choice");

            }
        }
        System.out.println("thank you, have a nice day!");
        */

        // java dice roller program
        /*Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0){
            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                System.out.println("you rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }
        else {
            System.out.println("number of dice must be greater than 0");
        }
*/

       /* char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}
        };

        for (char[] row : telephone){
            for (char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
        */

        //java quiz game

       /* String[] questions = {  "what is the function of a router?",
                                "what part of the computer is considered the brain?",
                                "what year was facebook launched?",
                                "who is known as the father of computers?",
                                "what was the first programming language?"
        };

        String[][] options = {  {"1. storing files", "2. encrypting data", "3. directing internet traffic"},
                                {"1. cpu", "2. hard drive", "3. ram"},
                                {"1. 2000", "2. 2005", "3. 2004"},
                                {"1. steve jobs", "2. charles babbage", "3. alan turing"},
                                {"1. java", "2.c", "3. fortran"}
        };

        int[] answers = {3, 1, 3, 2, 3};
        int score = 0;
        int guess;

        System.out.println("************************");
        System.out.println("welcome to the quiz game");
        System.out.println("************************");

        for (int i = 0; i < questions.length; i++){

            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                System.out.println("********");
                System.out.println("correct!");
                System.out.println("*********");
                score++;
            }
            else{System.out.println("********");
                System.out.println("wrong! ");
                System.out.println("*********");

            }

        }
        System.out.println("your final score is: " + score + " out of " + questions.length);

*/
        //rock paper scissors game

     /*   Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("invalid choice");
                continue;
            }


            computerChoice = choices[random.nextInt(3)];
            System.out.println("computer choice: " + computerChoice);


            if (playerChoice.equals(computerChoice)){
                System.out.println("it's a tie");
            }
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ) {
                System.out.println("you win!");
            }
            else {
                System.out.println("you lose");
            }

            System.out.print("play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("thanks for playing");
*/

        // java slot machine

       /* int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("**********************");
        System.out.println("welcome to java slots");
        System.out.println("symbols: \uD83C\uDF52 \uD83C\uDF49 \uD83C\uDF4B \uD83D\uDD14 \uD83D\uDFCA ");
        System.out.println("**********************");

        while (balance > 0){
            System.out.println("current balance: $" + balance);
            System.out.print("place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance){
                System.out.println("insufficient funds");
                continue;
            }
            else if (bet <= 0){
                System.out.println("bet must be greater than 0");
                continue;
            }
            else{
                balance -= bet;
            }

            System.out.println("spinning....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0){
                System.out.println("you won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("sorry you lost this round");
            }
            System.out.println("do you want to play again?(Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }
        }

        System.out.println("game over,your current balance is $" + balance );
*/

        //OOP
       /*  Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        for (Car car: cars){
            car.drive();
         */

        // abstraction
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        

        System.out.println(circle.area());
        System.out.println(triangle.area());


        scanner.close();
    }
   /* static String[] spinRow(){
        String[] symbols = { "🍒" , "🍉", "🍋", "🔔", "🟊" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "🟊" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
    */
    /* static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;
        System.out.print("enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("insufficient funds");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

     */
}
