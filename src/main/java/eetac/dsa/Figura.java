package eetac.dsa;

import java.text.DecimalFormat;

public abstract class Figura implements Comparable<Figura>{
    DecimalFormat df = new DecimalFormat("##.##");
    //No creo constructor porque no tengo variables, no es necesario.
    public abstract double areaFigura(); //si tuviese que pasar como parametros algun valor, lo pondria aqui en la clase abstracta?

    public int compareTo(Figura otraFigura){
        return (int)(this.areaFigura()-otraFigura.areaFigura());
    }
    public String toString() {
            return this.getClass().getSimpleName() + " " + df.format(this.areaFigura());
    }
}
