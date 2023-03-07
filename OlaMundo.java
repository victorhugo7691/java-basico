import java.util.Scanner;

public class OlaMundo{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		float n1, n2 = 0.0f;
		
		System.out.println("Ola Mundo");
		System.out.println("N1:");
		n1 = teclado.nextFloat();
		System.out.println("N2:");
		n2 = teclado.nextFloat();
		System.out.println("Resultado é " + n1/n2);
		
	}
}
