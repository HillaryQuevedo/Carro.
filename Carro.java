package negocio;

public class Carro {
    private int potencia;
    private double velocidad;
    private double precio;

    private static int numCarros = 0;
    private static final double IVA = 0.15;

    public Carro(int potencia, double velocidad, double precio){
        setPotencia(potencia);
        setVelocidad(velocidad);
        this.precio = precio;
        numCarros++;
    }

    public Carro(int potencia, double velocidad){
        setPotencia(potencia);
        setVelocidad(velocidad);
        this.precio = 0.0;
        numCarros++;
    }

    public Carro(){
        numCarros++;
    }

    public void setPotencia(int potencia){
        if (potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        if(velocidad < 0)
            this.velocidad = 0;
        else
            this.velocidad = velocidad;
    }

    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
    }

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getNumCarros(){
        return numCarros;
    }

    public static double getIva(){
        return IVA;
    }

    public double calcularPrecioVenta(double precio){
        return precio + (precio * IVA);
    }

    public void acelerar(){
        velocidad += potencia;
    }

    public void frenar(){
        velocidad -= potencia;
        if(velocidad < 0) {
            velocidad = 0;
        }
    }
}