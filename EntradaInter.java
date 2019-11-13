//Aplicação usando o pacote javaswing para capturar dados digitados pelo o usuário
//importando o pacote java.swing
import javax.swing.JOptionPane;
//Criando a classe
public class EntradaInter
{

	//criando a classe principal
	public static void  main (String [] args)
	{
		//Declarando a variavel para receber os dados digitados
		String name = "";
		name = JOptionPane.showInputDialog("Porfavor digite o seu nome");
		String msg = "Hello " + name + "!";
		JOptionPane.showMessageDialog(null, msg);
	}
}