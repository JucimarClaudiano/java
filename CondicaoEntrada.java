//Aplicação pega um dado digitado pelo o usuario e faz a condição 
//importando o pacote io
import java.util.Scanner;


//Declarando a classe principal
public class CondicaoEntrada
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		//Declarando uma variável do tipo Scanner
		Scanner sc = new Scanner(System.in);
		//Exibindo uma mensage para o usuário
		System.out.println("Digita a nota do aluno");
		//Chamando o objeto nota para passar o dados digitado pelo usuário
		int nota = sc.nextInt();
		//Invocando o comando if para executa a condição
		if(nota >=60)
		{
			System.out.println("Voce passou de fase");
			System.out.println("Sua pontuacao foi de " + nota);
		}else
		{
			System.out.println("Tente outra vez");
		}

	}
}