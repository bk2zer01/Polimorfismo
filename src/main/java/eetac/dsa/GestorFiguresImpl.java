package eetac.dsa;

import java.util.Arrays;

public class GestorFiguresImpl implements GestorFigures {

    public double sum(Figura[] l) {
        double ret=0;
        for(Figura f : l){
            ret += f.areaFigura();
        }
        return ret;
    }

    public void sort(Figura[] l) {
        Arrays.sort(l);
        //cuando creo el toString lo hago para todos los objetos de tipo figura?
    }

}
