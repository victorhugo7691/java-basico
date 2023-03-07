public class PositivoNegativo{
	 
	 public static int verificarSeENegativoOuPositivo(float numero){
		if(numero<0)
			return 0;
		return 1;
	}
	
	public static void main(String args[]){
		float numero = 0;
		System.out.println("Digite o numero");
		numero = Integer.parseInt(System.console().readLine());
		System.out.println("O resultado e " + verificarSeENegativoOuPositivo(numero));
	}
}

