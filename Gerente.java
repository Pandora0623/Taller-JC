public class Gerente extends Empleado{

    private float Bono;
    private float Horas;
    private float v_Horas;


    public Gerente(String Nombre, float Salario, float Bono, float Horas, float v_Horas){
        super(Nombre,Salario);
        this.Bono = Bono;
        this.Horas = Horas;
        this.v_Horas = v_Horas;
    }

    public float getBono(){
        return Bono;
    }

    public void setBono(float Bono){
        this.Bono = Bono;
    }

    public float CalcularSalario(){
        return (Horas*v_Horas)+Bono;
    }
    
}
