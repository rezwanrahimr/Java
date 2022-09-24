import java.util.Scanner;

public class JavaScanner{
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);


        System.out.println("Enter Your Name");
        String YourName = get.next();
        System.out.println("The name is" + YourName);

        System.out.println("Enter your Number");
        int number = get.nextInt();
        System.out.println(number);

        System.out.print("Enter The Rate ");
        float Rate = get.nextFloat();
        System.out.println(Rate);

        System.out.print("Are You Single? ");
        boolean Single = get.nextBoolean();
        System.out.println(Single);

        System.out.print("Enter a short Integer");
        short Short  = get.nextShort();
        System.out.println(Short);

        System.out.print("Enter a Long Integer");
        long LongLong  = get.nextLong();
        System.out.println(LongLong);


        System.out.println("Enter y/N");
        char Char = get.next().charAt(0);
        System.out.println(Char);





        get.close();

    }
}