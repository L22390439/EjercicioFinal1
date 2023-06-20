package paqprincipal;
import java.time.LocalTime;
public class Horario {
    //atributos
    String horaSalida;
    String horaLLegada;
    //metodos

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
