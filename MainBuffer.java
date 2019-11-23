//Aplicação  para mostrar um emprego controle da repetição com pacote Bufferead.
//Importando o pacote Bufferead
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Declarando a variavel MainBuffer
public class MainBuffer
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Instaciando a classe Buffer
		BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));

		//Declarando a variavel para receber o valor digitado
		String valor = "";
		System.out.println("Digite um valor");

		//Utilizando controle de excessão try
		try
		{
			//Recebendo o valor digitado
			valor = var1.readLine();
		}catch (IOException e)
		{
			System.out.println("Error");
		}
		//Convertendo String em int
		int valorint = Integer.parseInt(valor);

		//Utilizando o controle de repeticao for
		for(int x =1; x<=10; x++)
		{
			System.out.println(valorint +" X "+ x +" = "+ (valorint * x));
		}
	}
}