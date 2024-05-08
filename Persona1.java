public class Persona1{
    private String Nombre;
    private int Edad;
    private String FechaDeNacimiento;

    public void establecerNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String obtenerNombre(){
        return this.Nombre;
    }

    public void establecerEdad(int Edad){ 
        this.Edad = Edad;    
    }

    public int obtenerEdad(){
        return this.Edad;
    }

    public void establecerFechaDeNacimiento(String FechaDeNacimiento){
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String obtenerFechaDeNacimiento(){
        return this.FechaDeNacimiento;
    }

    
    
}
