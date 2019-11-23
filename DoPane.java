//Aplicativo para mostrar o emprego do controle de repetição do Do
//Importando o pacote  javax.swuing
import javax.swing.JOptionPane;

//Declarando a classe DoPane
public class DoPane
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Declarando a variavel para receber o dado digitado pelo usuário
		String ms;
		 ms = JOptionPane.showInputDialog("Digite um valor");

		 //Passando a variável de String para int
		 int msint = Integer.parseInt(ms);

		 //Empregando o controlde de repetição DO
		 do{
		 	String msg = "Hello World Java";
		 	JOptionPane.showMessageDialog(null, msg + msint++ );
		 	break; 
		 }while (msint <= 5);


		 //Empregando o comando de condição
		 String aviso = "O valor ultrapassou as expectativas";
		 if (msint >5)
		 	
		 JOptionPane.showMessageDialog(null, aviso);
		 
	}
}