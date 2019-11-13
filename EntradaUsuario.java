//Aplicação para capturar os dados digitado do usuario

//Importando os pacotes
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Criando a classe  EntradaUsuario
public class EntradaUsuario
{
	//Criando a classe principal
	 public static void main(String[] args) 
	 {

	 	//Instanciando o objeto dataIN da classe BufferedReader
	 	BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
	 	//Declarando a variavel para receber os dados digitados
	 	String name = "";
	 	System.out.print("Digita o seu nome:");
	 	//Usando a execessão do try cat
	 	try
	 	{
	 		name=dataIn.readLine();
	 	} catch (IOException e)
	 	{
	 		System.out.print("Error");
	 	}
	 	System.out.print("Ola " + name +"!");
		
	}

}