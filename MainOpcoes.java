//Aplica para mostrar o emprego do while for util
//Importando o pacote util
import java.util.Scanner;

//Declarando a classe MainOpcoes
public class MainOpcoes
{
	//Declarando a classe princial
	public static void main(String[] args) 
	{
		//Instanciando a classe Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma da opcoes abaixo");
		System.out.println(" 1 = Digitar ou 2 = Sair");

		//Armazenando a opção do cliente
		int opcao = sc.nextInt();

		//Criando o laço de repetição usando o While
		while(opcao == 1)
		{    
			int cont = 0;


			 System.out.println("Digite a nota do aluno" + " " + (cont+1));
			//Declarando a variavel para receber a nota
			Double notas = sc.nextDouble();
			System.out.println(cont);

			//Declarando o array
			double [] nota = new double[cont];

			//Empregando o for para mapear o array
			for (int cont1 =0; cont1 < nota.length; cont1++)
			{
			//Armazenando os dados digitados dentro da array
			nota[cont] = notas;
				}
			System.out.println(" D = Digitar ou S = Sair");

			//Usando o if para sair do While
			if (opcao != 1)
			{
				System.out.println("Você escolheu sair do Sistema");
				break;
			}

		}

	}
}