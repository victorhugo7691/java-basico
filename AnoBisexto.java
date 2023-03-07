
public class AnoBisexto {
	public static void main(String[] args) {
		int ano;
		
		System.out.println("\nEste programa verifica se um ano eh bissexto.\n");
		
		System.out.print("Ano: ");
		ano = Integer.parseInt(System.console().readLine());
		
		if(ano > 1584 && (ano % 400 == 0 && (ano % 4 == 0 && ano % 100 != 0)))
			System.out.println("Ano bissexto!");
		else
			System.out.println("O ano nao eh bissexto.");
	}
}
