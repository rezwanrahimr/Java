public class App{
    public static void main(String [] args){
        // int NumberOne = 1;
        // int NumberTwo = 2;
        // int total = (NumberOne + NumberTwo);
        // System.out.println(total);
        int a = 2;
        int b = 5;
        a = a++ + b++;
        b = ++a + ++b; 
        
        System.out.print(a);
        System.out.print(b);
    }
}