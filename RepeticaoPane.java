//Aplicação para usar o pacote swing com controle de repeticao
//Importando a classe javax.JOPane
import javax.swing.JOptionPane;

//Declarando a classe RepeticaoPane
public class RepeticaoPane
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Declarando  a variavel para receber o dado digitado pelo o usuário
		String jp = JOptionPane.showInputDialog("Digita um valor");

		//Passando a variável de String para int
		int jpint = Integer.parseInt(jp);

		//Declarando a variavel contator
		int contador = 0;

		//Usando o controle de repeticao
		while(contador < jpint)
		{
			String jpst = Integer.toString(jpint);
			String msg3 = "O valor = " + jpst;
			JOptionPane.showMessageDialog(null, msg3);
			jpint --;
		}
	}
}