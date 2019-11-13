//Aplicação  para mostrar a condição case usando o pacote util
//Importando o pacote util
import java.util.Scanner;

//Declarando a classe CondicaoScanner
public class CondicaoScanner
{
	//Declarando a classe principal
	 public static void main(String[] args) 
	 {
		//Instanciando a classe sacanner
		Scanner sca = new Scanner(System.in);
		System.out.println("Digita uma das opcoes 1 2 3 4");
		String opc = sca.next();

		//Passando a variavel de String para int
		int opcint = Integer.parseInt(opc);

		//Usando a condição case 
		switch (opcint)
		{
			case 1:
			System.out.println("Parabens voce passou");
			break;

			case 2:
			System.out.println("Voce esta de recuperacao");
			break;

			case 3:
			System.out.println("Voce foi reprovado");
			break;

			default:
			System.out.println("Opcao errada");
			break;
		}
	}
}