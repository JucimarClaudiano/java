//Aplicação java empregando o pacote io.BufferedReader no contorle de repetição
//Importando a o pacote
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Declarando a classe ControleBuffer
public class ControleBuffer
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Instanciando o objeto BufferedReader
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//Declarando a variável para receber o valor digitado
		String valor1 = "";
		System.out.println("Digita um valor");
		//Utilizando o pacote de excessao
		try
		{
			//recebendo o valor digitando pelo usuário
			valor1 = buf.readLine();
		}catch(IOException e)
		{
			System.out.println("ERROR");
		}
		//Convertendo String para int
		int valorint = Integer.parseInt(valor1);

		//Declarando o contador
		int contador = 0;

		//Empregando o controle de repetição
		while(contador < valorint)
		{
			System.out.println(valorint);
			valorint --;
		}
	}
}