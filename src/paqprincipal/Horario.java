package paqprincipal;
import java.time.LocalTime;
public class Horario {
    //atributos
    String horaSalida;
    String horaLLegada;
    //metodos
    LocalTime horaIni = LocalTime.of(4, 30);
    LocalTime horaFin = LocalTime.of(4, 30);

    public LocalTime getHoraIni(){return horaIni;}
    public LocalTime getHoraFin(){return horaFin;}

    //getter
    public String getHoraSalida(){
        return horaSalida;
    }
    public String getHoraLLegada(){
        return horaLLegada;
    }

    //setter
    public void setHoraSalida(){
        this.horaSalida=horaSalida;
    }
    public void setHoraLLegada(){
        this.horaLLegada=horaLLegada;
    }

    //contructor
    public Horario(String horaSalida, String horaLLegada){
        this.horaSalida=horaSalida;
        this.horaLLegada=horaLLegada;
    }
    public void mostrarInformacion() {
        System.out.println("La hora de llegada estimada: " + horaLLegada);
        System.out.println("La hora estimada de salida es: " + horaSalida);
    }
}
