package com.nttdata.mvn;

import org.apache.commons.lang3.math.Fraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Fraction f1 = Fraction.getFraction(5, 3);
    	Fraction f2 = Fraction.getFraction(8, 2);
        App app = new App();
        app.operaciones(f1, f2);
    }
    
    /**
     * Uso de la librería Apache Commons Lang.
     * Calcula el resultado al sumar, restar, multiplicar y dividir dos fracciones
     * @param f1 Primera fracción
     * @param f2 Segunda fracción
     */
    public void operaciones(Fraction f1, Fraction f2)
    {  	
    	Fraction suma = f1.add(f2);
    	Fraction resta = f1.subtract(f2);
    	Fraction mult = f1.multiplyBy(f2);
    	Fraction div = f1.divideBy(f2);
    	
    	System.out.println(f1+" + "+f2+" = "+suma);
    	System.out.println(f1+" - "+f2+" = "+resta);
    	System.out.println(f1+" * "+f2+" = "+mult);
    	System.out.println(f1+" / "+f2+" = "+div);
    }
}
