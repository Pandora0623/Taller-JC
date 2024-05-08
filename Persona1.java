import java.util.Date;

public class Persona1{
    private String Nombre;
    private int Edad;
    private Date FechaDeNacimiento;

    public void establecerNombre(String Nombre){
        if (Nombre == "" || Nombre == null){
            System.out.println("El nombre es invalido");
        }else{
            this.Nombre = Nombre;
        }
    }

    public String obtenerNombre(){
        return this.Nombre;
    }

    public void establecerEdad(int Edad){ 
        if (Edad < 0) {
            System.out.println("La edad debe ser mayor a 0");
        }else{
            this.Edad = Edad;
        }     
    }

    public int obtenerEdad(){
        return this.Edad;
    }

    public void establecerFechaDeNacimiento(Date FechaDeNacimiento){
        if (FechaDeNacimiento == null){
            System.out.println("Fecha invalida");
        }else{
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
}

    public Date obtenerFechaDeNacimiento(){
        return this.FechaDeNacimiento;
    }

    
    
}
