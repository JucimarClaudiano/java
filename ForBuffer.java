//Aplicação com objetivo de mostrar o emprego do controle de repetição For empregando o pacote  Ultil.BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Declarando a classe principal
public class ForBuffer
{
	//Criando a classe principal
	public static void main(String[] args) 
	{
		//instanciando a classe BufferedReader
		BufferedReader msg = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Digite um valor");
		//Declarando uma variavel para receber o valor digitado pelo  usuário
		String valor1=  "";

		//Empregando tratamento de excessão com o Try Catch
		try
		{
			//recebendo o valor
			valor1 = msg.readLine();

		}catch(IOException e)
		{
		System.out.println("ERROR");
		}
		//Passando a váriavel de String para int
		int valorint = Integer.parseInt(valor1);
		//Emmpregando controle de repetição for
		for(int x = 0; x <= valorint; x++)
		{
			System.out.println("O valoar de  x "+ x);
		}
	}

}