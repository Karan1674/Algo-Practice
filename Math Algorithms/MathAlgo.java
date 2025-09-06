import java.util.*;

class MathAlgo{

    static Scanner sc = new Scanner(System.in);
    
    static void digitCounts(){
        System.out.print("Enter the number to find the digit count :: ");
        int number= sc.nextInt();

        if (number == 0) {
            System.out.println("The number of digits in 0 is 1");
            return;
        }


        // First Method By Loops
        int digit = 0 , temp = number;
        while(temp>0){
            digit++;
            temp=temp/10;
        }
        System.out.println("The number of digits by loop method in " + number + " is " + digit);


        // Second Method By Simple Log
        int digits = (int) (Math.log10(number) + 1);
        System.out.println("The number of digits in by log " + number + " is " + digits);   
    }

    static void reverseNumber(){
        System.out.print("Enter the number Whose reverse you want to find :: ");
        int number= sc.nextInt();

        int rev=0;
        while(number>0){
           int lastDigit = number % 10;
           number = number / 10;
           rev = ( rev * 10 ) + lastDigit;
        }
        System.out.println("The Reverse of Given Number is " + rev);
    }

    static void checkPalindrome(){
        System.out.print("Enter the number to check whether it is a palindrome :: ");
        int number= sc.nextInt();

        int rev=0, temp = number;
        while(temp>0){
           int lastDigit = temp % 10;
           temp = temp / 10;
           rev = ( rev * 10 ) + lastDigit;
        }

        if(rev == number){
            System.out.print("The given Number " + number + " is palindrome");
        }
        else{
            System.out.print("The given Number " + number + " is not palindrome");
        }
    }

    static void checkArmstrong() {
        System.out.print("Enter the number to check whether it is an Armstrong number :: ");
        int number = sc.nextInt();

        int digits = (number == 0) ? 1 : (int)(Math.log10(number) + 1); 
        int sum = 0, temp = number;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println("The given Number " + number + " is an Armstrong Number");
        } else {
            System.out.println("The given Number " + number + " is not an Armstrong Number");
        }
    }

    static void printDivision(){
        System.out.print("Enter the number whose divisors you want to find :: ");
        int number= sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i * i <= number; i++){
            if(number % i == 0){
                arr.add(i);
                if(number / i != i){
                    arr.add(number / i);
                }
            }
        }
        Collections.sort(arr);
        System.out.print(arr);
    }

    static void checkPrime(){
        System.out.print("Enter the number to check whether it is prime or not :: ");
        int number= sc.nextInt();

        // Method 1

        int count = 0;
        for(int i = 1; i * i <= number; i++){
            if(number % i == 0){
                count++;
                if(number / i != i){
                    count++;
                }
            }
        }

        if(count == 2){
            System.out.println("The given Number " + number + " is a prime number");
        }
        else{
            System.out.println("The given Number " + number + " is not a prime number");
        }

        // Method 2

        boolean isPrime = true;
        if (number <= 1) isPrime = false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("The given Number " + number + " is a prime number");
        }
        else{
            System.out.println("The given number " + number + " is not a prime number");
        }
    }

    static void printGCD(){

        System.out.print("Enter the first number :: ");
        int number1= sc.nextInt();

        System.out.print("Enter the Second number :: ");
        int number2= sc.nextInt();

        // Method 1

        int min = number1 < number2 ? number1 : number2;
        int GCD = 1;

        for(int i = min; i > 0; i--){
            if(number1 % i == 0 && number2 % i == 0){
                GCD = i;
                break;
            }
        }
        System.out.println("The greatest common divisor is "+ GCD);

        // Method 2 By Euclidean Algorithm

        while(number1 > 0 && number2 > 0){
            if(number1 > number2) number1 = number1 % number2;
            else number2 = number2 % number1;
        }

        if(number1 == 0){
            System.out.print("The greatest common divisor by Euclidean Algorithm is "+ number2);
        }
        else {
            System.out.print("The greatest common divisor by Euclidean Algorithm is "+ number1);
        }
    }

    static void primeFactorization(){
        System.out.print("Enter the number whose prime factorization you want to find :: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Prime factorization is not defined for " + number);
            return;
        }

        System.out.print("Prime factors of " + number + " are: ");
        while(number % 2 == 0){
            System.out.print("2 ");
            number = number / 2;
        }

        for(int i = 3; i * i <= number; i = i + 2){
            while(number % i == 0){
                System.out.print(i + " ");
                number = number / i;
            }
        }

        if(number > 2 ){
            System.out.print(number);
        }
    }


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Math Algorithms Menu ---");
            System.out.println("1. Count Digits");
            System.out.println("2. Reverse Number");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Check Armstrong Number");
            System.out.println("5. Print Divisors");
            System.out.println("6. Check Prime Number");
            System.out.println("7. Compute GCD");
            System.out.println("8. Prime Factorization");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> digitCounts();
                case 2 -> reverseNumber();
                case 3 -> checkPalindrome();
                case 4 -> checkArmstrong();
                case 5 -> printDivision();
                case 6 -> checkPrime();
                case 7 -> printGCD();
                case 8 -> primeFactorization();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

}