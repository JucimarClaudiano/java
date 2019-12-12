//Aplicação para percorrer um array de palavras criado pelo o usuário e encontrar o a palavra chave
//Importando o pacote Util Scanner
import java.util.Scanner;

//Declarando a classe principal
public class ArrayScanner
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Instanciando a classe Scanner
		Scanner sc = new Scanner(System.in);

		//Instanciando o array para armazenar as palavras digitadas pelo o usuário e o contador
		String[] palavras = new String [ ];

		//Usando comando if para predestinar o numero de palavras que o cliente vai digitar
	
		
		//Empregando o uso do For e i
		for(int cont = 0; cont < palavras.length; cont ++)
		{
			System.out.println("Digita um palavara" + (cont +1));
			//Armazenando os dados digitados pelo usuário
			String pal = sc.next();

			//Indicando para o computador onde armazernar no array
			palavras[cont] = pal;
     	}

     		System.out.println("Digita uma das palavras");
     		//Armazenando a palavra digitada
     		String pal1 = sc.next();

     		//Declarando a variavel Boolean para mostrar ao sistema parar
     		Boolean v = true;

     		//Empregando o for para imprimir os dado do array
     	for(int cont = 0; cont < palavras.length; cont++)
     	{

     		//Empregando o if para fazer condição
     		if(palavras[cont].equals(pal1) )
     		{
     	
     			System.out.println("Palavra encontrada" + " " + pal1);
     			v=true;
     			break;
     		}
     		}
     		if (v =false) 
     		{
     		    System.out.println("Palavra nao encontrada");
     		}
     		
     	
	}
}
