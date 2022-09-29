package MapaAstral;

import java.time.LocalTime;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Signo {
    private String nome;
    private MonthDay dataInicio;
    private MonthDay dataFim;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private List<Ascendente> ascendentes;

    public static List<Signo> getTodosSignos(){
        var signos = new ArrayList();

        var signo = new Signo();
        signo.setNome("Áries");
        signo.setDataInicio(MonthDay.of(3,21));
        signo.setDataFim(MonthDay.of(4,20));
        signo.setAscendentes(getAscendentesAries());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Touro");
        signo.setDataInicio(MonthDay.of(4,21));
        signo.setDataFim(MonthDay.of(5,20));
        signo.setAscendentes(getAscendentesTouro());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Gêmeos");
        signo.setDataInicio(MonthDay.of(5,21));
        signo.setDataFim(MonthDay.of(6,20));
        signo.setAscendentes(getAscendentesGemeos());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Câncer");
        signo.setDataInicio(MonthDay.of(6,21));
        signo.setDataFim(MonthDay.of(7,22));
        signo.setAscendentes(getAscendentesCancer());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Leão");
        signo.setDataInicio(MonthDay.of(7,23));
        signo.setDataFim(MonthDay.of(8,22));
        signo.setAscendentes(getAscendentesLeao());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Virgem");
        signo.setDataInicio(MonthDay.of(8,23));
        signo.setDataFim(MonthDay.of(9,22));
        signo.setAscendentes(getAscendentesVirgem());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Libra");
        signo.setDataInicio(MonthDay.of(9,23));
        signo.setDataFim(MonthDay.of(10,22));
        signo.setAscendentes(getAscendentesLibra());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Escorpião");
        signo.setDataInicio(MonthDay.of(10,23));
        signo.setDataFim(MonthDay.of(11,21));
        signo.setAscendentes(getAscendentesEscorpiao());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Sagitário");
        signo.setDataInicio(MonthDay.of(11,22));
        signo.setDataFim(MonthDay.of(12,21));
        signo.setAscendentes(getAscendentesSagitario());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Capricórnio");
        signo.setDataInicio(MonthDay.of(12,22));
        signo.setDataFim(MonthDay.of(1,20));
        signo.setAscendentes(getAscendentesCapricornio());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Aquário");
        signo.setDataInicio(MonthDay.of(1,21));
        signo.setDataFim(MonthDay.of(2,19));
        signo.setAscendentes(getAscendentesAquario());
        signos.add(signo);

        signo = new Signo();
        signo.setNome("Peixes");
        signo.setDataInicio(MonthDay.of(2,20));
        signo.setDataFim(MonthDay.of(3,25));
        signo.setAscendentes(getAscendentesPeixes());
        signos.add(signo);

        return signos;
    }

    private static List<Ascendente> getAscendentesAries(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesLeao(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesSagitario(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesTouro(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesVirgem(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesCapricornio(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesGemeos(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesLibra(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesAquario(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesCancer(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesEscorpiao(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }

    private static List<Ascendente> getAscendentesPeixes(){
        var ascendentes = new ArrayList();

        var ascendente = new Ascendente();
        ascendente.setNome("Áries");
        ascendente.setHoraInicio(LocalTime.of(6,31));
        ascendente.setHoraFim(LocalTime.of(8,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Touro");
        ascendente.setHoraInicio(LocalTime.of(8,31));
        ascendente.setHoraFim(LocalTime.of(10,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Gêmeos");
        ascendente.setHoraInicio(LocalTime.of(10,31));
        ascendente.setHoraFim(LocalTime.of(12,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Câncer");
        ascendente.setHoraInicio(LocalTime.of(12,31));
        ascendente.setHoraFim(LocalTime.of(14,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Leão");
        ascendente.setHoraInicio(LocalTime.of(14,31));
        ascendente.setHoraFim(LocalTime.of(16,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Virgem");
        ascendente.setHoraInicio(LocalTime.of(16,31));
        ascendente.setHoraFim(LocalTime.of(18,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Libra");
        ascendente.setHoraInicio(LocalTime.of(18,31));
        ascendente.setHoraFim(LocalTime.of(20,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Escorpião");
        ascendente.setHoraInicio(LocalTime.of(20,31));
        ascendente.setHoraFim(LocalTime.of(22,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Sagitário");
        ascendente.setHoraInicio(LocalTime.of(22,31));
        ascendente.setHoraFim(LocalTime.of(0,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Capricórnio");
        ascendente.setHoraInicio(LocalTime.of(0,31));
        ascendente.setHoraFim(LocalTime.of(2,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Aquário");
        ascendente.setHoraInicio(LocalTime.of(2,31));
        ascendente.setHoraFim(LocalTime.of(4,30));
        ascendentes.add(ascendente);

        ascendente = new Ascendente();
        ascendente.setNome("Peixes");
        ascendente.setHoraInicio(LocalTime.of(4,31));
        ascendente.setHoraFim(LocalTime.of(6,30));
        ascendentes.add(ascendente);

        return ascendentes;
    }
}

