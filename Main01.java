//Aplicação voltada para emprego do java swing, array, e controle de repeticao
//Importando o pacote swing
import javax.swing.JOptionPane;

//Declarando a classe
public class Main01
{
	//Declarando a classe principal
	 public static void main(String[] args) 
	 {	
	 	//Declarando  a varivel para receber os dados digitados pelo usuário
	 	String jpo;
	 	//Declarando o array
	 	String nomes[] = {};
	 	//Usando o controle de repetição
	 	for (int i =0; i >nomes.length; i++)
	 	{
		jpo = JOptionPane.showIntputDialog("Digite os nomes");
		//Salvando os nomes digitados dentro de uma array
		nomes[i] = jpo;
		}
	}
}
