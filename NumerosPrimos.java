public class NumerosPrimos{
	
	public static boolean ePrimo(int numero){
		if(numero <= 1)
			return false;
		for(int i=2; i<numero; i++){
			if(numero%i == 0)
				return false;
		}
		return true;
	} 
	
	public static void main(String[] args){
		
		System.out.println("Inicio");
		for(int i = 1; i<=100; i++){
			if(ePrimo(i))
				System.out.println(i);
		}
	}
}
