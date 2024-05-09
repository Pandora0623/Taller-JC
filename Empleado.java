public class Empleado implements Trabajador{

    private String Nombre;
    private float Salario;
    public Empleado(String Nombre, float Salario){
        Nombre = Nombre;
        Salario = Salario;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        Nombre = Nombre;
    }
    public float getSalario(){
        return Salario;
    }
    public void setSalario(float Salario){
        Salario = Salario;
    }

    public void RealizarTarea(){
        System.out.println("Realizando tarea laboral");
    }
}