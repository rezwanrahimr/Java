import javax.swing.JOptionPane;

public class Adation{
    public static void main(String [] args){

        // 
      String firstNumber = JOptionPane.showInputDialog("First Integer");
      String secondNumber = JOptionPane.showInputDialog("Second Integer");

      int numberOne = Integer.parseInt(firstNumber);
      int NumberTwo = Integer.parseInt(secondNumber);

      int sum =  (numberOne + NumberTwo);

      JOptionPane.showMessageDialog(null,"Total Number:"+sum);

      System.exit(0);

    }
}