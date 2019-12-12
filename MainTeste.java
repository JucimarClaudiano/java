//Aplicação com propósito de testar os comandos
//Declarando a classe principal
public class MainTeste
{
	//Declarando a classe principal
	public static void main(String[] args) 
	{
		// Uitlizando comando de repetição
		//Declarando a variavel
		String i ="sair";
		String k  = "";
		int j = 0;
		while(i !=k)
		{
			System.out.println("Esse é o valor de j" + j++);
			if(j > 10)
			{
				k= "sair";
				System.out.println(k);
			}
		}
	}
}