import java.util.Scanner;



public class Aviao {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
		
	}
	
	
	public static void menu() {

		 System.out.println("Altura: " + altura + "\n1 - Decolar\n2 - Pousar\n"
			 		+ "3 - Escolher altura");
		 int opt = leia.nextInt();
		 
		 	switch(opt) {
		 	case 1 :
		 		decolar();
		 		break;
		 	case 2 :
		 		pousar();
		 		break;
		 	case 3 :
		 		altura();
		 		break;
		 	}
	}
	

	static int altura = 0;
	static int limite = 13000;
	
	private static void exploda() {
		if(altura > limite) {
			System.out.println("Boomm... Se fudeu");
			System.exit(0);
		}
	}
	
	private static void altura() {
			if(altura > 0)  {
				System.out.println("Altura desejada:\n");
				int a = leia.nextInt();
					altura = a;
					
			} else {
				System.out.println("Você ainda não decolou");
			}
			exploda();
			menu();
	}



	
	

	
		public static void decolar() {
			
			if(altura == 0 ) {
				System.out.println("Decolando");
					altura = 400;
			} else {
				System.out.println("Você já está no ar");
			}
			exploda();
			menu();
		} 
		
		public static void pousar() {
			if(altura > 0 && altura < 1000) {
				System.out.println("Pouso realizado com sucesso");
					altura = 0;
			} else if(altura > 1000) {
				System.out.println("Altura muito alta para pouso, desça mais");
			} else {
				System.out.println("Você ainda não decolou");

			}
			exploda();
			menu();
		}

}