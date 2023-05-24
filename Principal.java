package Revi;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        retangular obj1 = new retangular(10, 2);

        double areaRetangulo = obj1.calcularArea();
        JOptionPane.showMessageDialog(null, "A Area do Retangulo é:" + areaRetangulo);

        Circulo obj2 = new Circulo(2.5);

        double perimetroCirculo = obj2.calcularPerimetro();
        JOptionPane.showMessageDialog(null, "O perimetro do circulo é: " + perimetroCirculo);
    }
}
