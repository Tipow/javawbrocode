
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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
        double temp;
        double newTemp;
        String unit;

        System.out.print("enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("convert to celsius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9);

        System.out.printf("the new temperature is %.2f%s", newTemp, unit);



        scanner.close();
    }
}
