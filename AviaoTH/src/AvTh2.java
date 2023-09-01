import java.util.Scanner;
public class AvTh2 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] argns) {
    media();
}

    public static void media() {
        AvTh n = new AvTh();

        System.out.println("Digite sua primeira nota: ");
        n.n1 = ler.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        n.n2 = ler.nextDouble();
        
        	n.resul();
    }

}


