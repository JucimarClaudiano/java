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
		//Instaciando a variável opcao, armazenar a opcao do usuário
		int opcao = 0;
		//Instanciando a classe Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita s para sair ou c para continuar");
			opcao = sc.nextInt();
			System.out.println(opcao);


		//Usando comando de decisão
		if(opcao == 0)
		{

			
			System.out.println("Digite a nota do aluno");
			//Declarando a variavel para receber a nota
			double notas = sc.nextDouble();
			
			
		}else
		{
			System.out.println("Fim do programa");
		}
	}

}	

		
	

