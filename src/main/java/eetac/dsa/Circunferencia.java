package eetac.dsa;

import java.text.DecimalFormat;

public class Circunferencia extends Figura {
    private double r;
    DecimalFormat df = new DecimalFormat("#.00");
    public Circunferencia (double r){
        this.r = r;
    }

    @Override
    public double areaFigura() {
        return Math.pow(this.r,2)*Math.PI;
    }
}
