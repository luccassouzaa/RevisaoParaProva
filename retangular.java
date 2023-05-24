package Revi;

public class retangular extends FormaGeometrica {
    
    private double comprimento;
    private double largura;

    public retangular(double x, double y){
        this.comprimento = x;
        this.largura = y;
    }

    @Override
    public double calcularArea() {
        return comprimento + largura;
    }
}
