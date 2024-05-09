import java.util.Date;

abstract public class Estudiante extends Persona1 implements Trabajador{
    private String grado;

    public Estudiante(String Nombre, int Edad, Date FechaDeNacimiento, String grado) {
        super(Nombre, Edad, FechaDeNacimiento);
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado;
    }

    public void RealizarTarea(){
        System.out.println("Realizando tarea escolar");
    }
}
