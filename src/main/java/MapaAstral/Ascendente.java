package MapaAstral;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Ascendente {
    private String nome;
    private LocalTime horaInicio;
    private LocalTime horaFim;
}
