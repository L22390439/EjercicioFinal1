package paqprincipal;

import java.nio.file.SecureDirectoryStream;
//atributos
public class Destino {
    String ciudadDestino;
    String horaLlegada;
    String puertaDesabordaje;
    String cintaDeequipaje;
//metodos
    //getter
    public String getCiudadDestino(){
        return ciudadDestino;
    }
    public String getHoraLlegada(){
        return horaLlegada;
    }
    public String getPuertaDesabordaje(){
        return puertaDesabordaje;
    }public String getCintaDeequipaje(){
        return cintaDeequipaje;
    }
    //setter
    public void setCiudadDestino(){
        this.ciudadDestino=ciudadDestino;
    }
    public void setHoraLlegada(){
        this.horaLlegada=horaLlegada;
    }
    public void setPuertaDesabordaje(){
        this.puertaDesabordaje=puertaDesabordaje;
    }
    public void setCintaDeequipaje(){
        this.ciudadDestino=ciudadDestino;
    }
    //constructor
    public Destino(String ciudadDestino, String horaLLegada, String puertaDesabordaje, String cintaDeequipaje)
    {
        this.ciudadDestino=ciudadDestino;
        this.horaLlegada=horaLLegada;
        this.puertaDesabordaje=puertaDesabordaje;
        this.ciudadDestino=ciudadDestino;
    }
    public void mostrarInformacion() {
        System.out.println("Bienvenido a la ciudad de: " + ciudadDestino);
        System.out.println("Hora llegada: " + horaLlegada);
        System.out.println("La puerta de desabordaje es: " + puertaDesabordaje);
        System.out.println("La zona de equipaje es la: " + cintaDeequipaje);
    }
}
