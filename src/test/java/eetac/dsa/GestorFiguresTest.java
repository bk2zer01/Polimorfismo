package eetac.dsa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class GestorFiguresTest {
    GestorFigures gestor = null;
    Figura l[] = null;

    @Before
    public void setUp() {
        this.l = new Figura[5];
        l[0] = new Rectangulo(4,6);
        l[3] = new Cuadrado(2);
        l[2] = new Circunferencia(4);
        l[1] = new Triangulo(4,2);
        l[4] = new Cuadrado(5);
        this.gestor = new GestorFiguresImpl();

    }

    @Test
    public void testSuma() {
        //DecimalFormat df = new DecimalFormat("##.##");
        double res = gestor.sum(l);
        System.out.println("\nSuma de todas las areas:\n" + res); // df.format(gestor.sum(l)));
        Assert.assertEquals("suma", 107.27, res, 0.25);
    }


    @Test
    public void testsort() {
        Assert.assertEquals("sort", Rectangulo.class, l[0].getClass());
        Assert.assertEquals("sort", Triangulo.class, l[1].getClass());

        gestor.sort(l);

        Assert.assertEquals("sort", Triangulo.class, l[0].getClass());
        Assert.assertEquals("sort", Cuadrado.class, l[1].getClass());
        System.out.println(Arrays.asList(l));
    }

//        Prueba.sort(l);

}
