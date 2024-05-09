public class Vendedor extends Empleado {

    private float Ventas;
    private float Horas;
    private float v_Horas;

    public Vendedor(String Nombre, float Salario, float Ventas, float Horas, float v_Horas){
        super(Nombre,Salario);
        this.Ventas = Ventas;
        this.Horas = Horas;
        this.v_Horas = v_Horas;
    }

    public float getVentas(){
        return Ventas;
    }

    public void setVentas(float Ventas){
        this.Ventas = Ventas;
    }

    public float getHoras(){
        return Horas;
    }

    public void setHoras(float Horas){
        this.Horas = Horas;
    }

    public float getv_Horas(){
        return v_Horas;
    }

    public void setv_Horas(float v_Horas){
        this.v_Horas = v_Horas;
    }

    public float CalcularSalario(){
        return (v_Horas*Horas)+(Ventas*(10/100));
    }

    
}
