
// Compariision.
import javax.swing.JOptionPane;

public class Comparison {
    public static void main(String[] args) {

        String numberOne;
        String numberTwo;

        numberOne = JOptionPane.showInputDialog("Enter the First Number : ");
        numberTwo = JOptionPane.showInputDialog("Enter the Second Number : ");

        int NumberOne = Integer.parseInt(numberOne);
        int NumberTwo = Integer.parseInt(numberTwo);
        String result = "";

        if (NumberOne == NumberTwo) {
            result = result + NumberOne + "==" + NumberTwo;
        }  if (NumberOne != NumberTwo) {
            result = result + "\n" +  NumberOne + "!=" + NumberTwo;
        }  if (NumberOne > NumberTwo) {
            result =result + "\n" + NumberOne + ">" + NumberTwo;
        }  if (NumberOne < NumberTwo) {
            result =result + "\n" + NumberOne + "<" + NumberTwo;
        }  if (NumberOne >= NumberTwo) {
            result =result + "\n" + NumberOne + ">=" + NumberTwo;
        }  if (NumberOne <= NumberTwo) {
            result =result + "\n" + NumberOne + "<=" + NumberTwo;
        }

        JOptionPane.showMessageDialog(null, "Comparison Results" + result);
    }
}