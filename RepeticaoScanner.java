//Aplicação para mostrar o uso do pacote Util com controle de repeticao While
//Importando o pacote Util
import java.util.Scanner;

//Declarando a classe RepeticaoScanner
public class RepeticaoScanner
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Instanciando a clsse Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita um numero");
		//Recebendo o dado digitado pelo o usuário
		String var1 = sc.next();

		//Passando a variavel var1 de String para int
		int var2 = Integer.parseInt(var1);

		//Declarando a varivacel contador
		int contador = 0;

		//Utilizando o controle de repetição while
		while( contador < var2 )
		{
		 System.out.println(var2);
		 var2 --;	
		}

	}
}