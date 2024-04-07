package aula0404;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite o dia:");
		int dia = tec.nextInt();
		
		System.out.println("Digite o mês:");
		int mes = tec.nextInt();
		
		System.out.println("Digite o ano:");
		int ano = tec.nextInt();
		contaTempo(dia, mes, ano);
		
		tec.close();
		
	}
	public static void contaTempo(int dia, int mes, int ano) {
		LocalDate hoje = LocalDate.now();
		LocalDate dataInformada = LocalDate.of(ano, mes, dia);
		Period periodo = Period.between(hoje, dataInformada);
		System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
		



	}
	
}
