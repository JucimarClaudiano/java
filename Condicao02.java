//Aplicacao de Condição com Interface grafica e captando dados digitados do usuario
//importando o pacote do java swing
import javax.swing.JOptionPane;

//Criando a classe Condicao02
public class Condicao02
{
	//Criando a classe principal
	 public static void main(String[] args)
	{
		//Declarando a variavel para receber o dado digitado pelo o usuário
		double nota = 0;
		nota = Integer.parseInt (JOptionPane.showInputDialog(null,"Digite a nota"));
		//Invocando condição para verificar a nota com a média
		if(nota > 70)
		{
			String msg = "Sua nota e " + nota + "Excelente";
			JOptionPane.showMessageDialog(null, msg);
		}
		else if ((nota <= 70) && (nota >= 50))
		{
			String msg = "Sua nota e " + nota + " Estude mais";
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (nota < 50 )
		{
			String msg = "Sua nota e " + nota + " Game Over";
			JOptionPane.showMessageDialog(null, msg);
		}

		
	}
}