import java.util.Scanner;

//Double.parseDouble(System.console().readLine());
//System.console.readLine().charAt(0)
//         System.out.println("Bem-vindo\nao\nmundo\nJava!");
// System.out.printf("%f ao quadrado eh %f\n", num, quad);

public class CalculoDaMedia{
	public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
	
	float n1, n2, n3, n4, res = 0.0f;
	System.out.println("Nota n1: ");
	n1 = Float.parseFloat(System.console().readLine());
	System.out.println("Nota n2: ");
	n2 = Float.parseFloat(System.console().readLine());
	System.out.println("Nota n3: ");
	n3 = Float.parseFloat(System.console().readLine());
	System.out.println("Nota n4: ");
	n4 = Float.parseFloat(System.console().readLine());
	res = (n1+n2+n3+n4)/4;
	System.out.println("O resultado é: " + res);
	}
}

/*%% - mostra um sinal de % (não é necessário informar nenhuma variável ou expressão para substituí-lo).
%d - permite mostrar valores inteiros.
%f - permite mostrar valores reais. É possível especificar quantas casas decimais se deseja colocar a vírgula. Por exemplo, “%.2f” mostraria um número com duas casas após a vírgula e “%.5f” mostraria um número com 5 casas após a vírgula. Se o número tiver menos casas do que o especificado, será completado com zeros à direita. Se tiver mais dígitos do que o especificado, será arredondado para o número de dígitos desejado.
%b - permite mostrar um valor lógico.
%c - permite mostrar um valor caractere.
%s - permite mostrar um valor literal.*/
