public class EstatisticasCinema {

public static void main(String[] args) {

int idade, somaIdades = 0, maiorIdade = -1;

int resOtimo = 0, resRuim = 0, resPessimo = 0;

char nota;

double mediaIdades;

for(int cont = 1; cont <= 100; cont++) {

System.out.printf("--- ESPECTADOR %03d ---", cont);

System.out.printf("Idade: ");

idade = Integer.parseInt(System.console().readLine());

System.out.printf("Nota: ");

nota = System.console().readLine().charAt(0); //Lê sequência de caracteres e preenche somente com o priumeiro

 

if(nota == 'A')

       resOtimo++;

else if(nota == 'D') {

       resRuim++;

                     somaIdades += idade;

              } else if(nota == 'E') {

              resPessimo++;

              if(idade > maiorIdade)

                   maiorIdade = idade;

              }

       }

       mediaIdades = somaIdades / resRuim;

 

       System.out.printf("Notas Ótimo = %d\n", resOtimo);

       System.out.printf("Média Idades = %.1f\n", mediaIdades);

       System.out.printf("Percentual notas Péssimo = %d\n", resPessimo);

       System.out.printf("Maior idade a responder “Péssimo” = %d\n", maiorIdade);

}




}
