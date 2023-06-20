package paqprincipal;

public class Piloto {
   //atributos
    String nombre;
    String apellido;
    int id;
    int edad;
    int horasVuelo;
    //metodos
    //getter
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getId(){
        return id;
    }
    public int getEdad(){
        return edad;
    }public int getHorasVuelo(){
        return horasVuelo;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public void setHorasVuelo(int horasVuelo){
        this.horasVuelo=horasVuelo;
    }
    //constructor
    public Piloto(String nombre, String apellido, int id, int edad, int horasVuelo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        this.edad=edad;
        this.horasVuelo=horasVuelo;
    }
    public void mostrarInformacion() {
        System.out.println("El nombre del piloto a cargo del vuelo: " + nombre);
        System.out.println("Con apellido de: " + apellido);
        System.out.println("Su identificación es: " + id);
        System.out.println("La edad del piloto: " + edad);
        System.out.println("Horas de vuelo completadas: " + horasVuelo);
    }
}
