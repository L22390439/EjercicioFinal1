package paqprincipal;

public class CiudadOrigen {
    //atributos
    String ciudad;
    String terminal;
    String puertaAbordaje;
    String numVuelo;
    String  horaSalida;
    //metodos
    //getter
    public String getCiudad(){
        return ciudad;
    }
    public String getTerminal(){
        return terminal;
    }
    public String getPuertaAbordaje(){
        return puertaAbordaje;
    }
    public String getNumVuelo(){
        return numVuelo;
    }
    public String getHoraSalida() {
        return horaSalida;
    }

    //setter
    public void setCiudad(){
        this.ciudad=ciudad;
    }
    public void setTerminal(){
        this.terminal=terminal;
    }
    public void setPuertaAbordaje(){
        this.puertaAbordaje=puertaAbordaje;
    }
    public void setNumVuelo(){
        this.numVuelo=numVuelo;
    }
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    //contructor
    public CiudadOrigen(String ciudad, String terminal, String puertaAbordaje, String numVuelo, String horaSalida){
        this.ciudad=ciudad;
        this.terminal=terminal;
        this.puertaAbordaje=puertaAbordaje;
        this.numVuelo=numVuelo;
        this.horaSalida=horaSalida;
    }
    public void mostrarInformacion() {
        System.out.println("Ciudad: " + ciudad);
        System.out.println("La terminal: " + terminal);
        System.out.println("La puerta de abordaje: " + puertaAbordaje);
        System.out.println("EL numero de vuelo: " + numVuelo);
        System.out.println("La hora estimada de salida es: " + horaSalida);
    }
}
