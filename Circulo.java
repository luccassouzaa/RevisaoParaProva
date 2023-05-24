package Revi;

public class Circulo implements FormaBiDimensional {

    private double raio;

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double x){
        this.raio = x;
    }

    @Override
    public double calcularPerimetro() {
        return 2* Math.PI * raio;
    }
    
}
