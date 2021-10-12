package Q2;

import java.util.Scanner;

public class PricesAndPercentage {
    //method to calculate and display required outputs
    public static void calculator(double inclusivePrice,double tax){

        //variable declaration
        double taxExclusive;

        //calculating tax exclusive price
        taxExclusive = (inclusivePrice * 100) / (tax + 100);

        //display tax exclusive price
        System.out.println("Tax exclusive price: $"+ taxExclusive);
    }

    public static void main(String[] args) {
        //variable declaration
        double inclusivePrice;
        double percentage;

        Scanner scanner = new Scanner(System.in);

        //getting user inputs
        System.out.print("Please enter the Tax inclusive price: $");
        inclusivePrice = scanner.nextDouble();
        System.out.print("Please enter the Tax percentage: ");
        percentage = scanner.nextDouble();

        //calling the method
        calculator(inclusivePrice,percentage);
    }
}
