import paqprincipal.*;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Intinerario intinerario = new Intinerario("Ciudad de México", "Oaxaca", "4:30 de la tarde", "Julian Alvarez, id 1451, 45 años con 15 de vuelo");
        CiudadOrigen ciudadOrigen = new CiudadOrigen("ciudad mexico","Guadalupe Santos", "1A", "154", "4:30 de la tarde");
        Destino destino = new Destino("Oaxaca","5 de la tarde","5B","Sala 3C");
        Horario horario = new Horario("4:30 de la tarde", "5 de la tarde");
        Piloto piloto = new Piloto("Julian","Alvarez",1451,45,15);

        /*LocalTime horaIni = LocalTime.of(4,30);
        LocalTime horaFin = LocalTime.of(4,30);

        System.out.println(horaFin.compareTo(horaIni));*/

        System.out.println("Información del Intinerario:");
            intinerario.setCiudadOrigen();
            intinerario.setCiudadDestino();
            intinerario.getHoraSalida();
            intinerario.setPiloto();
            intinerario.mostrarInformacion();

    }

}