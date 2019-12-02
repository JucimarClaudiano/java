//Aplica para mostrar o emprego do while for util
//Importando o pacote util
import java.util.Scanner;

//Declarando a classe MainOpcoes
public class MainOpcoes
{
	//Declarando a classe princial
	public static void main(String[] args) 
	{
		interUsuario();
		
	}

	//Criando metodo para comunicar com o usuario

	static void interUsuario()
	{
		Scanner sc = new Scanner(System.in);


		//Usando comando de condição
		

			System.out.println("Digita -0 para sair");

			int cont = 0;
			System.out.println("Digite a nota do aluno" + " " + ( cont + 1));
			//Declarando a variavel para receber a nota
			double notas = sc.nextDouble();
			System.out.println(notas);

		


	}	

		
	
}
