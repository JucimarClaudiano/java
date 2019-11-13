//Aplicação objetivo mostrar o uso  condigçõa switch
//Declarando a classe  Escolha
public class Escolha
{
	//Declarando a classe principal
	 public static void main(String[] args) 
	 {
		//Declarando a constante para receber o valor 
		int cons = 4;
		//Empregando switch
		switch (cons)
		{
			case 1:
			System.out.println("Excelente voce passou");
			break;

			case 2:
			System.out.println("Voce esta de recuperacao");
			break;

			case 3:
			System.out.println("Estude mais");
			break;

			default:
			System.out.println("Nem uma das opcoes e valida");
		}
		

	}
}