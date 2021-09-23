import java.util.Scanner;

class JavaScanner {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the text:");
        String string = in.nextLine();
        System.out.println("You entered string " + string);

        System.out.println("Enter the integer value:");
        int integer = in.nextInt();
        System.out.println("You entered integer " + integer);

        System.out.println("Enter the float value:");
        float floatValue = in.nextFloat();
        System.out.println("You entered float " + floatValue);

        // closing scanner
        in.close();
    }
}

// Use Scanner