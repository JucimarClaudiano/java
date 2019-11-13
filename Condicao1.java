//Aplicação para mostrar as condições if-else-if
//Declarando a classe Condicao1
public class Condicao1
{

	//Declarando a classe principal
	 public static void main(String[] args) 
	 {
		//Declarando uma variável armazenar o valor
		Double grade = 92.0;
		//Utilizando a condição if
		if (grade >= 90)
		{
			System.out.println("Excelente");
		}

		 else if((grade < 90) && (grade >= 80))
		{
			System.out.println("Bom");
		}

		else if((grade < 80) && (grade >= 60))
		{
			System.out.println("Estude mais");
		}
		else 
		{
			System.out.println("Você não passou");
		}  
	}
		
	

}	