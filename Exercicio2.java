//Aplicativo para capturar dados digitados pelo usuário e mostrar como uma interface grafica
//importando o pacote javax.swing
import javax.swing.JOptionPane;

//Criando a classe Exercicio2
public class Exercicio2
{
	//Criando a classe principal
	public static void main (String [] args) 
	{
		//Declarando a variável para armazenar os dados digitados
		String word = "";
		word = JOptionPane.showInputDialog("Digite uma palavara");

		String word1 = "";
		word1 = JOptionPane.showInputDialog("Digite uma palavara");

		String word2 = "";
		word2 = JOptionPane.showInputDialog("Digite uma palavara");

		//Mostrando o resultado digitado pelo usuário
		String msg = (word + " "+ word1 + " "+ word2);
	    JOptionPane.showMessageDialog(null, msg );

	}
}