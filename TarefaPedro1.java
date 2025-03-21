import javax.swing.JOptionPane;
        
public class TarefaPedro1 {

    public static void main(String args[]) {
       String firstNumber =
               JOptionPane.showInputDialog("Coloque o Primeiro Valor Para a soma");
       String secondNumber =
               JOptionPane.showInputDialog(" Coloque o segundo valor para a soma");
       
       int number1 = Integer.parseInt( firstNumber );
       int number2 = Integer.parseInt( secondNumber );
       
       int sum = number1 + number2;
       
       JOptionPane.showMessageDialog(null, "A soma é " + sum, "Soma de dois numeros inteiros ",JOptionPane.PLAIN_MESSAGE );
    }
}
