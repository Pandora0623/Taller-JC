import java.util.Date;

public class Estudiante extends Persona1 {
    private String grado;

    public Estudiante(String Nombre, int Edad, Date FechaDeNacimiento, String grado) {
        super(Nombre, Edad, FechaDeNacimiento);
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado;
    }
}
