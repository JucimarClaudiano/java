//Aplicação para fazer uma taboada empregando o pacote Util.Scanner
//Importando o pacote Scanner
import java.util.Scanner;

//Declarando a classe MainScanner
public class MainScanner
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Instanciando a classe Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita um valor numerico");
		
		//Declarando a variavel para receber o valor digitado pelo o usuário
		String valor = sc.next();

		//Passando a variavel de String para int
		int valorint  = Integer.parseInt(valor);

		//Declarando uma variáel com emprego de contador
		int x = 0;

		//Unsando o emprego do While
		while (x <=10)
		{
			
			System.out.println(valorint +" X "+ x +" = "+ (valorint * x++));
		}
	}
}