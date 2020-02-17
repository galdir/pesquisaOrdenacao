package calculaIMC;

import javax.swing.JOptionPane;

//declaracao de classe igual nome do arquivo
public class calculaIMC {
	//metodo principal
	public static void main(String[] args) {
		// obtem entrada de usuario de um dialogo JOPtionPane 
		String primeirNumero = 
				JOptionPane.showInputDialog("Informe a altura");
		String segundoInteiro =
				JOptionPane.showInputDialog("Informe o peso");

		// convert String inputs to int values for use in a calculation
		double altura = Double.parseDouble(primeirNumero); 
		double peso = Double.parseDouble(segundoInteiro);

		double imc = peso/(altura*altura); // add numbers

		// display result in a JOptionPane message dialog
		JOptionPane.showMessageDialog(null, "O IMC é " + imc, 
				"Cálculo de IMC", JOptionPane.WARNING_MESSAGE);
	} 



}
