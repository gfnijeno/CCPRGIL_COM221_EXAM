import java.util.Scanner;

public class Exam {
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        String evenodd = (lastTwoDigits % 2 == 0) ? "even" : "odd";
        System.out.println(lastTwoDigits + " is " + evenodd);
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        if(isPrime(lastDigit)) {
            System.out.println(lastDigit + " is a prime number");
        }
        else{
            System.out.println(lastDigit + " is a composite number");
        }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your first name: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int nameCount = firstName.length() + surName.length();
        System.out.println("The character length of your first name and surname is " + nameCount);

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();
        int largest = thirdNumber > (firstNumber > secondNumber ? firstNumber : secondNumber) ? thirdNumber : ((firstNumber > secondNumber) ? firstNumber : secondNumber); 
        System.out.println("The largest number is: "+ largest);  


        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int sixDigits = studentNumber % 1000000;
        System.out.println(sixDigits);

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        if (studentNumber == 2022104045) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();
        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();


        // If BSIT
            if (course.equals("BSIT")) {
                System.out.println("Enter your specialization (MWAA or MAA): ");
                String specialization1 = scan.next();
                if ((specialization1.equals("MWAA")) || (specialization1.equals("MAA"))) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");

        // If BSCS
                }
            } else if (course.equals("BSCS")) {
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next();  
                if ((specialization2.equals("DF")) || (specialization2.equals("ML"))) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            }
 

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        switch (strand) {
            case "STEM":
                System.out.println("VALID");
                break;
            case "ICT":
                System.out.println("VALID");
                break;
            case "ABM":
                System.out.println("VALID");
                break;
            case "HUMSS":
                System.out.println("VALID");
                break;
            case "HOME ECONOMICS":
                System.out.println("VALID");
                break;
            case "ARTS AND DESIGN":
                System.out.println("VALID");
                break;
            case "TVL MARITIME":
                System.out.println("VALID");
                break;
            default:
                System.out.println("INVALID");
                break;
        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        if (studentEmailAddress.contains("@students.national-u.edu.ph") && studentEmailAddress.contains("daet")) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3
        
        System.out.println("11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        System.out.println(mystery(n));

        // Close scanner
        scan.close();
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
    public static int mystery(int a) {
        int total = 0;
        for (int i = a; i > 0; i--) {
            if (i % 2 == 0) {
                total += i;
            }
            else if (i % 2 == 1) {
                total -= i;
            }
        }
        return total;

    }

}
