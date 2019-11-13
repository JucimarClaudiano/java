//Aplicação usando a switch com interação com o usuário
//importando os pacotes java.io
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Declarando a classe EscolhaBuffe
public class EscolhaBuffe
{
	//Declarando a classe principal
	 public static void main(String[] args) 
	 {
		
		//Instanciando o objeto dataIN da classe BufferedReader
		BufferedReader digita = new BufferedReader(new InputStreamReader (System.in));
		//Declarando a variavel para receber os dados digitados
	 	String opc= "";
	 	System.out.println("Entra com uma opcao");
	 	//Usando pacota IOException
	 	try
	 	{ 
	 		opc = digita.readLine();
	 	}catch(IOException e)
	 	{
	 		System.out.println("ERROR");
	 	}
	 	//Convertendo uma String para int
	 	int opcint = Integer.parseInt(opc);
	 	//Empregando condicao switch
	 	switch (opcint)
	 	{
	 		case 1:
	 		System.out.println("Excelente voce passou");
	 		break;

	 		case 2:
	 		System.out.println(" voce esta recuperacao");
	 		break;

	 		case 3:
	 		System.out.println("Voce esta reprovado");
	 		break;

	 		default :
	 		System.out.println("Nenuma das opcao valida");
	 		break;
	 	}

	}
}