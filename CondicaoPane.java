//Aplicativo para mostrar o emprego do switch com pacote JOptionPane
//Importando o pacote JOptionPane
import javax.swing.JOptionPane;

//Declarando a classe CondicaoPane
public class CondicaoPane
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Declarando a classe para receber o dado digitado pelo o usuário
		String jpo;
		jpo = JOptionPane.showInputDialog("Digita uma das opcoes 1 2 3 4");

		//Passando a variável jpo de String para int
		int jpoint = Integer.parseInt(jpo);

		//Utilizando switch para fazer a condição
		switch(jpoint)
		{
			case 1: 
			String msg = "Parabens voce passou";
			JOptionPane.showMessageDialog(null, msg);
			break;

			case 2: 
			String msg1 = " voce esta de recuperacao";
			JOptionPane.showMessageDialog(null, msg1);
			break;

			case 3: 
			String msg2 = " voce está reprovado";
			JOptionPane.showMessageDialog(null, msg2);
			break;

			default: 
			String msg3 = " Opcao Invalida";
			JOptionPane.showMessageDialog(null, msg3);
			break;
		}



	}
}