package Controller;

import java.util.Scanner;

public class Validation {
    public double checkInputDouble() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }
    public boolean checkOdd(double n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }
}
