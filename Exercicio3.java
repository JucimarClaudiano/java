//Aplicação para  capturar 3 palavras digitados pelo o usuario
//importando o pacotes IO
import java.io.*;

//Criando a classe Exercicio3
public class Exercicio3
{

	//Criando a classe principal
	 public static void main(String[] args) 
	 {
		//Criando os objetos
		BufferedReader datain = new BufferedReader(new InputStreamReader (System.in));
		BufferedReader datain01 = new BufferedReader(new InputStreamReader (System.in));
		BufferedReader datain02 = new BufferedReader(new InputStreamReader (System.in));

		//Mostranso a insturção para o usuário
		System.out.println("Digita uma palavra");
		//Declarando as variáveis para armazenar os dados digitados pelo usuário
		String word = "";
		try
		{

			//Pegando os dados do usuário e armazenando na memória
			word = datain.readLine();

		}catch (IOException e)
		{
			System.out.print("Error");
		}

		System.out.println("Digita outra palavra");
		String word1 = "";
		
			try
		{

			//Pegando os dados do usuário e armazenando na memória
			word1 = datain01.readLine();

		}catch (IOException e)
		{
			System.out.print("Error");
		}

		System.out.print("Digite outra palavra");
		String word2 = "";

			try
			{
				word2 = datain02.readLine();
			}catch (IOException e)
			{
				System.out.print("Error");
			}
		
		//Mostrando os dados do cliente em uma linha
		System.out.println (word + " "+ word1 + " "+ word2);
	}
}