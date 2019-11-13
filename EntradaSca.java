//Aplicaçao para capturar dados digitados pelo o usuário usando o pacote java.util
//Importando o pacote java.util
import java.util.Scanner;
//Criando a classe EntradaSca
public class EntradaSca
{
	//Criando a classe principal
	public static void main(String[] args) 
	{
		//Instanciando o objeto sc da classe Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Digita o seu nome:");
		String name = sc.next();
		System.out.print("Ola " + name +"!");
	}
}