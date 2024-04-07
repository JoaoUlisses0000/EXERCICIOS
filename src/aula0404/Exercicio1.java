package aula0404;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercicio1 {
    
    public static String DataPorExtenso() {
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();
        
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH 'horas e' mm 'minutos'", new Locale("pt", "BR"));
        
        String dataPorExtenso = hoje.format(formatoData);
        String horaPorExtenso = agora.format(formatoHora);
        
        String diaSemana = hoje.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, new Locale("pt", "BR"));
        
        String frase = "Hoje é " + diaSemana + ", " + dataPorExtenso + " e agora são " + horaPorExtenso + ".";
        
        return frase;
    }

    public static void main(String[] args) {
        System.out.println(DataPorExtenso());
    }
}
