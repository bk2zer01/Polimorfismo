package eetac.dsa;

public class Rectangulo extends Figura {
    private double l1,l2;  //ponerlo en protected? //Si lo pongo en privado y quiero muestrearlo en la propia figura puedo?
    //Si lo pongo privado los lados, y quiero muestrearlo en una figura heredada como el cuadrado puedo?
    double valor;
    public Rectangulo (double L1, double L2) {
        this.l1 = L1;
        this.l2 = L2;
    }
    @Override
    public double areaFigura() {
        valor = this.l1 * this.l2;
        return valor;
    }
}

