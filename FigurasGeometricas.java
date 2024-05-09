public class FigurasGeometricas {
    private String Nombre;
    private String Color;

    public void establecerNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String obtenerNombre(){
        return this.Nombre;
    }

    public void establecerColor(String Color){
        this.Color = Color;
    }

    public String obtenerColor(){
        return this.Color;
    }

    public class Rectangulo extends FigurasGeometricas {
        private double longitud;
        private double ancho;
    
        public Rectangulo(double longitud, double ancho) {
            this.longitud = longitud;
            this.ancho = ancho;
        }
    
        
    }
    
    public class Circulo extends FigurasGeometricas {
        private double radio;
    
        public Circulo(double radio) {
            this.radio = radio;
        }
    
       
    }

    
}
