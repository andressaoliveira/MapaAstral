package MapaAstral;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MapaAstralApplication {
    public static void main(String[] args) {

        List<Signo> listaSignos = Signo.getTodosSignos();

        //LocalDateTime dataHoraNascimento = LocalDateTime.of(1995,5,25,17,05);
        LocalDateTime dataHoraNascimento = LocalDateTime.of(1976,1,4,0,10);

        int idadeUsuario = getIdade(dataHoraNascimento);
        boolean bissexto = verificaBissexto(dataHoraNascimento);
        String dataFormatada = getDataFormatada(dataHoraNascimento);
        String tz = getTimeZone(dataHoraNascimento);
        Signo signoObjeto = getSignoObjeto(dataHoraNascimento, listaSignos);
        String signo =  getSigno(signoObjeto);
        Ascendente ascendenteObjeto = getAscendenteObjeto(dataHoraNascimento.toLocalTime(), signoObjeto);
        String ascendente = getAscendente(ascendenteObjeto);
        String signoLunar = getSignoLunar(dataHoraNascimento);

        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Bissexto: " + bissexto);
        System.out.println("Data Formatada: " + dataFormatada);
        System.out.println("TimeZone: " + tz);
        System.out.println("Signo: " + signo);
        System.out.println("Ascendente: " + ascendente);
        System.out.println("Signo Lunar: " + signoLunar);
    }

    private static int getIdade(LocalDateTime data){
        Period idade = Period.between(data.toLocalDate(), LocalDate.now());
        return idade.getYears();
    }

    private static boolean verificaBissexto(LocalDateTime data){
        boolean ehBissexto = data.toLocalDate().isLeapYear();
        return ehBissexto;
    }

    private static String getDataFormatada(LocalDateTime data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        String dataFormatada = formatter.format(data);
        return dataFormatada;
    }

    private static String getTimeZone(LocalDateTime data){
        ZoneId zoneId = ZoneId.of("America/Recife");
        ZoneOffset current = zoneId.getRules().getOffset(data);
        return current.toString();
    }

    private static Signo getSignoObjeto(LocalDateTime data, List<Signo> signos){

        MonthDay mesDia = MonthDay.of(data.getMonth(), data.getDayOfMonth());
        Signo signo = null;

        for (Signo s : signos){
            if(isWithinRange(mesDia, s.getDataInicio(), s.getDataFim())){
                signo = s;
                break;
            }
        }

        return signo;
    }

    private static String getSigno(Signo signo) {
        if(signo == null )
            return "Signo não encontrado!";

        return signo.getNome();
    }

    private static Ascendente getAscendenteObjeto(LocalTime hora, Signo signo){
        Ascendente ascendente = null;

        for (Ascendente a : signo.getAscendentes()){
            if(isWithinRangeTime(hora, a.getHoraInicio(), a.getHoraFim())){
                ascendente = a;
                break;
            }
        }

        return ascendente;
    }


    private static String getAscendente(Ascendente ascendente) {
        if(ascendente == null )
            return "Ascendente não encontrado!";

        return ascendente.getNome();
    }

    private static String getSignoLunar(LocalDateTime data){
        return "Signo não encontrado!";
    }

    private static boolean isWithinRange(MonthDay dataNascimento, MonthDay startDate, MonthDay endDate){
        boolean result = false;
        if(startDate.isAfter(endDate)) { //virada do ano
            var endDateAux = MonthDay.of(12,25);
            result = !(dataNascimento.isBefore(startDate) || dataNascimento.isAfter(endDateAux));
            if (!result){
                var startDateAux = MonthDay.of(1,1);
                result = !(dataNascimento.isBefore(startDateAux) || dataNascimento.isAfter(endDate));
            }
        }
        else
        {
            result = !(dataNascimento.isBefore(startDate) || dataNascimento.isAfter(endDate));
        }
        return result;
    }

    private static boolean isWithinRangeTime(LocalTime horaNascimento, LocalTime startTime, LocalTime endTime){
        boolean result = false;
        if(startTime.isAfter(endTime)) { //virada do ano
            var endTimeAux = LocalTime.of(23,59);
            result = !(horaNascimento.isBefore(startTime) || horaNascimento.isAfter(endTimeAux));
            if (!result){
                var startTimeAux = LocalTime.of(0,0);
                result = !(horaNascimento.isBefore(startTimeAux) || horaNascimento.isAfter(endTime));
            }
        }
        else
        {
            result = !(horaNascimento.isBefore(startTime) || horaNascimento.isAfter(endTime));
        }
        return result;
    }

}
