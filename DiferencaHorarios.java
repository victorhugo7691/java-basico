public class DiferencaHorarios {
	public static void main(String[] args) {
		int horaInicio, minInicio, horaFim, minFim, horaDif, minDif;
		
		System.out.println("\nEste programa calcula a diferenca entre dois horarios.\n");
		
		System.out.print("Hora inicio: ");
		horaInicio = Integer.parseInt(System.console().readLine());
		System.out.print("Minutos inicio: ");
		minInicio = Integer.parseInt(System.console().readLine());
		
		System.out.print("Hora fim: ");
		horaFim = Integer.parseInt(System.console().readLine());
		System.out.print("Minutos fim: ");
		minFim = Integer.parseInt(System.console().readLine());
		
		horaDif = horaFim - horaInicio;
		minDif = minFim - minInicio;
		
		if(horaDif < 0)  {
			horaDif = horaDif + 24;
			minDif = minDif + 60;
		}
		if(minDif < 0){
			horaDif = horaDif ‑ 1;
			
		}
		System.out.printf("\nDIFERENCA = %02d:%02d\n", horaDif, minDif);
	}
}
15 final
13 inicial
2

45 final
55 inicial
-10
