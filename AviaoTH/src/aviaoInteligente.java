import java.util.Scanner;
public class aviaoInteligente {

	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);	
		System.out.println("Bem vindo(a) ao avião TH, aqui você terá a imensurável chance de controlar este incrível avião. Preparado(a)? ");
		boolean RespostaValida = false;
		while (!RespostaValida) {
			System.out.println("Responda Sim ou não: ");   
   String resp = teste.nextLine().toLowerCase();
		
if (resp.equalsIgnoreCase("sim")) {
	System.out.println("Então vamos nessa!");
	RespostaValida = true;

} else if (resp.equalsIgnoreCase("não")) { 
	System.out.println("Então sai fora!");
	RespostaValida = true;
} else {
	System.out.println("Resposta inválida, Tente novamente.");
	
}

		}


	}
}

