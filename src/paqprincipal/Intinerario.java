package paqprincipal;

public class Intinerario {
    //atributos
    String ciudadOrigen;
    String ciudadDestino;
    String horaSalida;
    String piloto;

    //metodos
    //getter
    public String getCiudadOrigen(){
        return ciudadOrigen;
    }
    public String getCiudadDestino(){
        return  ciudadDestino;
    }
    public String getHoraSalida() {
        return horaSalida;
    }
    public String getPiloto(){
        return piloto;
    }
    //setter
    public void setCiudadOrigen(){
        this.ciudadOrigen=ciudadOrigen;
    }
    public void setCiudadDestino(){
        this.ciudadDestino=ciudadDestino;
    }
    public void setHoraLLegada(){
        this.horaSalida=horaSalida;
    }
    public void setPiloto(){
        this.piloto=piloto;
    }
    //constructor
    public Intinerario(String ciudadOrigen, String ciudadDestino, String horaSalida, String piloto)
    {
        this.ciudadOrigen=ciudadOrigen;
        this.ciudadDestino=ciudadDestino;
        this.horaSalida=horaSalida;
        this.piloto=piloto;
    }
    public void mostrarInformacion() {
        System.out.println("La ciudad de origen: " + getCiudadOrigen());
        System.out.println("La ciudad de destino: " + getCiudadDestino());
        System.out.println("Hora estimada de despege: " + getHoraSalida());
        System.out.println("Piloto acargo del vuelo: " + getPiloto());

    }
}
