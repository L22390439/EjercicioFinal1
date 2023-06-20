import paqprincipal.*;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Intinerario intinerario = new Intinerario("Ciudad de México", "Oaxaca", "4:30 de la tarde", "Julian Alvarez, id 1451, 45 años con 15 de vuelo");
        CiudadOrigen ciudadOrigen = new CiudadOrigen("ciudad mexico","Guadalupe Santos", "1A", "154", "4:30 de la tarde");
        Destino destino = new Destino("Oaxaca","5 de la tarde","5B","Sala 3C");
        Horario horario = new Horario("4:30 de la tarde", "5 de la tarde");
        Piloto piloto = new Piloto("Julian","Alvarez",1451,45,15);


        System.out.println("Información del Intinerario:");

        Scanner teclado = new Scanner(System.in);

        String ciudadDestino;
        String ciudadPrincpal;
        String horaSalida;
        String nombrePiloto;

        System.out.println("Ciudad de origen");
        ciudadPrincpal=teclado.nextLine();
        System.out.println("Ciudad a que quiere viajar");
        ciudadDestino=teclado.nextLine();
        System.out.println("Su hora de salida estimada");
        horaSalida=teclado.nextLine();
        System.out.println("El piloto a cargo");
        nombrePiloto=teclado.nextLine();

        /*System.out.println("La ciudad de origen: " + ciudadOrigen);
        System.out.println("La ciudad de destino: " + ciudadDestino);
        System.out.println("Hora estimada de despege: " + horaSalida);
        System.out.println("Piloto acargo del vuelo: " + nombrePiloto);*/

        intinerario.setCiudadOrigen();
        intinerario.setCiudadDestino();
        intinerario.getHoraSalida();
        intinerario.setPiloto();
        intinerario.mostrarInformacion();


       LocalTime horaIni = LocalTime.of(04,30);
       LocalTime horaFin = LocalTime.of(05,00);
       LocalTime horaIni2 = LocalTime.of(04,30);
       LocalTime horaFin2 = LocalTime.of(10,43);

       int comparacion;
       comparacion = horaIni.compareTo(horaFin);
       if (comparacion<0){
           System.out.println("El horario no choca con alguno otro piloto");
       }
       else if (comparacion>1){
           System.out.println(("El horario no choca con alguno otro piloto"));
       }
       else {
           System.out.println("Ambos tienen el mismo horario");
       }
        int comparacion2;
        comparacion2 = horaIni2.compareTo(horaFin2);
        if (comparacion2<0){
            System.out.println("El horario no choca con alguno otro piloto");
        }
        else if (comparacion2>1){
            System.out.println(("El horario no choca con alguno otro piloto"));
        }
        else {
            System.out.println("Ambos tienen el mismo horario");
        }
        }
    }