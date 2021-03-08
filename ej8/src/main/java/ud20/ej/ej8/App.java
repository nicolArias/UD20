package ud20.ej.ej8;

import operaciones.Operacion;
import visual.Visual;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Visual v= new Visual();
        Operacion op = new Operacion(v);
       op.incio();
    }
}
