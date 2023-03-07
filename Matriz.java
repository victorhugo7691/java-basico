public class Matriz{
	public static void main(String[] args){
		int matriz [][] = new int[3][3];
		int numero=0;
		for (int i = 1; i< matriz.length ; i++){
			for (int j = 1; j< matriz.length; j++){
				matriz[i][j] = numero;
				numero+=2;
			}
		}
		
		for (int i = 1; i< matriz.length ; i++){
			for (int j = 1; j< matriz.length; j++){
				System.out.println("A linha "+ i + " e coluna "+ j + " possui o elemento "+ matriz[i][j]);
			}
		}
		System.out.println("Encerrou");
	}
}
