import java.util.Scanner;

import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zadatak 1

        // Task 1a
        int a = addingIntegers(2, 2);
        int b = subtractingIntegers(2, 2);
        int c = multiplyingIntegers(2, 2);
        int d = divisioningIntegers(2, 2);

        // Task 1aa
        System.out.println("You are on task 1aa \n");

        int total = -1;
        while (total >= 0) {
            System.out.println("Please insert the number for the loop 1aa:");
            total = scanner.nextInt();
        }

        // Task 1aaa
        System.out.println("You are on task 1aaa \n");

        int numberForTheLoop1a;
        do {
            System.out.println("Please insert the number for the loop 1aaa:");
            numberForTheLoop1a = scanner.nextInt();
        } while (numberForTheLoop1a >= 0);

        //Task 1b
        System.out.println("You are on task 1b \n");

        int numberForTheLoop1b;

        do {
            System.out.println("Please enter any integer");
            numberForTheLoop1b = scanner.nextInt();
        } while (numberForTheLoop1b != -1000);
        {
            System.out.println("The exit number " + numberForTheLoop1b + " has been detected, you are out of the loop!");
        }

        //Task 1c
        System.out.println("You are on task 1c \n");

        int totalValueOfTheSum = 0;
        int numberToAddToTheValue;
        boolean runArray1c = true;

        while (runArray1c) {

            int previousValueOfTheSum = totalValueOfTheSum;
            numberToAddToTheValue = enterInteger();
            if (numberToAddToTheValue == -1000) break;
            totalValueOfTheSum = addingIntegers(previousValueOfTheSum, numberToAddToTheValue);
            System.out.println("The total of " + previousValueOfTheSum + " and " + numberToAddToTheValue + " is " + totalValueOfTheSum);
        }

        //Task 1d
        System.out.println("You are on task 1d \n");

        int totalValue = 0;
        int numberForOperation;
        String operationToPerform;
        boolean runArray1d = true;

        while (runArray1d) {

            int previousValueOfTheSum = totalValue;
            operationToPerform = enterOperation();

            if (operationToPerform.equals("="))
                break; //Adding this as I have offered this operation in function I used for next tasks

            numberForOperation = enterInteger();

            if (operationToPerform.equals("+")) {
                totalValue = addingIntegers(previousValueOfTheSum, numberForOperation);
            } else if (operationToPerform.equals("-")) {
                totalValue = subtractingIntegers(previousValueOfTheSum, numberForOperation);
            } else if (operationToPerform.equals("*")) {
                totalValue = multiplyingIntegers(previousValueOfTheSum, numberForOperation);
            } else if (operationToPerform.equals("/")) {
                totalValue = divisioningIntegers(previousValueOfTheSum, numberForOperation);
            }
            System.out.println("The total of " + previousValueOfTheSum + " and " + numberForOperation + " is " + totalValue);
        }

        //Task 1e
        System.out.println("You are on task 1e \n");

        int totalValuePlus = 0;
        int numberForOperationPlus;
        String operationToPerformPlus;
        boolean runArray1e = true;

        while (runArray1e) {
            int previousValueOfTheSum = totalValuePlus;
            operationToPerformPlus = enterOperation();

            if (operationToPerformPlus.equals("="))
                break; //Adding this as I have offered this operation in function I used for next tasks

            numberForOperationPlus = enterInteger();

            if (operationToPerformPlus.equals("+")) {
                totalValuePlus = addingIntegers(previousValueOfTheSum, numberForOperationPlus);
                System.out.println("The sum of " + previousValueOfTheSum + " and " + numberForOperationPlus + " is " + totalValuePlus);
            } else if (operationToPerformPlus.equals("-")) {
                totalValuePlus = subtractingIntegers(previousValueOfTheSum, numberForOperationPlus);
                System.out.println("The difference of " + previousValueOfTheSum + " and " + numberForOperationPlus + " is " + totalValuePlus);
            } else if (operationToPerformPlus.equals("*")) {
                totalValuePlus = multiplyingIntegers(previousValueOfTheSum, numberForOperationPlus);
                System.out.println("The product of " + previousValueOfTheSum + " and " + numberForOperationPlus + " is " + totalValuePlus);
            } else if (operationToPerformPlus.equals("/")) {
                totalValuePlus = divisioningIntegers(previousValueOfTheSum, numberForOperationPlus);
                System.out.println("The quotient of " + previousValueOfTheSum + " and " + numberForOperationPlus + " is " + totalValuePlus);
            }
        }

        //Task 1f
        System.out.println("You are on task 1f \n");

        int totalValueAdvanced = 0;
        int numberForOperationAdvanced;
        String operationToPerformAdvanced;

        do {
            int previousValueOfTheSum = totalValueAdvanced;
            operationToPerformAdvanced = enterOperation();

            if (operationToPerformAdvanced.equals("+")) {
                numberForOperationAdvanced = enterInteger();
                totalValueAdvanced = addingIntegers(previousValueOfTheSum, numberForOperationAdvanced);
                System.out.println("The sum of " + previousValueOfTheSum + " and " + numberForOperationAdvanced + " is " + totalValueAdvanced);
            } else if (operationToPerformAdvanced.equals("-")) {
                numberForOperationAdvanced = enterInteger();
                totalValueAdvanced = subtractingIntegers(previousValueOfTheSum, numberForOperationAdvanced);
                System.out.println("The difference of " + previousValueOfTheSum + " and " + numberForOperationAdvanced + " is " + totalValueAdvanced);
            } else if (operationToPerformAdvanced.equals("*")) {
                numberForOperationAdvanced = enterInteger();
                totalValueAdvanced = multiplyingIntegers(previousValueOfTheSum, numberForOperationAdvanced);
                System.out.println("The product of " + previousValueOfTheSum + " and " + numberForOperationAdvanced + " is " + totalValueAdvanced);
            } else if (operationToPerformAdvanced.equals("/")) {
                numberForOperationAdvanced = enterInteger();
                totalValueAdvanced = divisioningIntegers(previousValueOfTheSum, numberForOperationAdvanced);
                System.out.println("The quotient of " + previousValueOfTheSum + " and " + numberForOperationAdvanced + " is " + totalValueAdvanced);
            }

        } while (!operationToPerformAdvanced.equals("="));
        {
            System.out.println("Calculator result is " + totalValueAdvanced + " .");
        }

        //Task 1g
        System.out.println("You are on task 1g \n");

        int numberForOperationBonus;
        int initialIntegerValue = 0;
        String operationToPerformBonus;
        int totalValueBonus = 0;
        System.out.println("Is initial integer value defined: y/n");
        String isIntegerValueDefined = scanner.next();

        if (isIntegerValueDefined.contains("n")) {
            System.out.println("Please enter the initial integer value:");
            initialIntegerValue = scanner.nextInt();
            totalValueBonus = initialIntegerValue;
        }

        // Could also be done with boolean true or false

        totalValueBonus = initialIntegerValue;

        do {
            int previousValueOfTheSum = totalValueBonus;
            System.out.println("Which operation would you like to use: *,/,+,-,=?");
            operationToPerformBonus = scanner.next();

            if (operationToPerformBonus.equals("+")) {
                numberForOperationBonus = enterInteger();
                totalValueBonus = addingIntegers(previousValueOfTheSum, numberForOperationBonus);
                System.out.println("The sum of " + previousValueOfTheSum + " and " + numberForOperationBonus + " is " + totalValueBonus);
            } else if (operationToPerformBonus.equals("-")) {
                numberForOperationBonus = enterInteger();
                totalValueBonus = subtractingIntegers(previousValueOfTheSum, numberForOperationBonus);
                System.out.println("The difference of " + previousValueOfTheSum + " and " + numberForOperationBonus + " is " + totalValueBonus);
            } else if (operationToPerformBonus.equals("*")) {
                numberForOperationBonus = enterInteger();
                totalValueBonus = multiplyingIntegers(previousValueOfTheSum, numberForOperationBonus);
                System.out.println("The product of " + previousValueOfTheSum + " and " + numberForOperationBonus + " is " + totalValueBonus);
            } else if (operationToPerformBonus.equals("/")) {
                numberForOperationBonus = enterInteger();
                totalValueBonus = divisioningIntegers(previousValueOfTheSum, totalValueBonus);
                System.out.println("The quotient of " + previousValueOfTheSum + " and " + numberForOperationBonus + " is " + totalValueBonus);
            }

        } while (!operationToPerformBonus.equals("="));
        {
            System.out.println("Calculator result is " + totalValueBonus + " .");
        }

        //Zadatak 2
        System.out.println("You are on task 2 \n");

        int index = 0;
        int addNumberToArray;
        int[] arrayOfNumbers = new int[15];

        for (int i = 0; i <= arrayOfNumbers.length; i++) {
            addNumberToArray = enterInteger();

            if (addNumberToArray != -10) {
                arrayOfNumbers[i] = addNumberToArray;
                index = index + 1;
            }

            if (addNumberToArray == -10) {
                for (int j = 0; j < index; j++) {
                    System.out.println(arrayOfNumbers[j]);
                }
                System.out.println("Do you want to continue with adding elements to array? y/n ");
                String keepAddingNumbers = scanner.next();
                if (keepAddingNumbers.contains("n")) {
                    break;
                } else i = i - 1;
            }
        }

        //Zadatak 3
        System.out.println("You are on task 3 \n");

        System.out.println("Please choose an function you want the use: \n 1. Is string a palindrom \n 2. Filter an array \n 3. Number is divisible by X");
        String choosenFunction = scanner.next();
        if (choosenFunction.contains("1")) {
            isPalindrome();
        }
        if (choosenFunction.contains("2")) {
            filterAnArray();
        }
        if (choosenFunction.contains("3")) {
            isDivisibleByNumber();
        }

    }

    public static int addingIntegers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int subtractingIntegers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int multiplyingIntegers(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int divisioningIntegers(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static int enterInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer");
        int numberForOperation = scanner.nextInt();
        return numberForOperation;
    }

    public static String enterOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation would you like to use: *,/,+,-,=?");
        String operationToBePerformed = scanner.next();
        return operationToBePerformed;
    }

    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a word to check if it is palindrome:");
        String wordPalindrome = scanner.next();

        char[] stringToChar = wordPalindrome.toCharArray();
        int middleOfArray = (stringToChar.length / 2) - 1;
        boolean toCheckPalindrome = true;

        for (int i = 0; i <= middleOfArray; i++) {
            if (stringToChar[i] == stringToChar[(stringToChar.length - 1) - i]) {
                toCheckPalindrome = true;
            } else toCheckPalindrome = false;
        }
        if (toCheckPalindrome == true) {
            System.out.println("The inserted word " + wordPalindrome + " is palindrome.");
        } else {
            System.out.println("The inserted word " + wordPalindrome + " is not a palindrome.");
        }
    }

    public static void isDivisibleByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number you would want to check divisibility of:");
        int mainNumber = scanner.nextInt();
        System.out.println("Please insert a number you would want to check divisibility with:");
        int x = scanner.nextInt();
        if (mainNumber % x == 0) {
            System.out.println("The number " + mainNumber + " is divisible with " + x + " .");
        } else {
            System.out.println("The number " + mainNumber + " is not divisible with " + x + " .");
        }

    }

    public static int[] filterAnArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please the length of the array you want to create:");
        int arrayLength = scanner.nextInt();
        int[] arrayOfNumbers = new int[arrayLength];

        for (int i = 0; i <= arrayLength - 1; i++) {
            arrayOfNumbers[i] = enterInteger();
        }
        System.out.println("Please enter the number you want to exclude from the array:");
        int numberToExclude = scanner.nextInt();

        int index = 0;
        int[] filteredArray = new int[arrayLength];
        for (int i = 0; i <= arrayLength - 1; i++) {
            if (arrayOfNumbers[i] != numberToExclude) {
                filteredArray[index++] = arrayOfNumbers[i];
            } else continue;
        }
        System.out.println(index);
        for (int i = 0; i < index; i++) {
            System.out.println(filteredArray[i]);
        }
        return filteredArray;
    }
}