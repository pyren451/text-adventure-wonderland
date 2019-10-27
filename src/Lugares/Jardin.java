package Lugares;
/**
 *
 * @author kar
 */
public class Jardin implements Explorable{

    @Override
    public void irNorte() {
        System.out.println("Te acercas y hay una madriguera;\nno cabe duda de "+
                            "que el conejo blanco ha entrado ahí.");
    }

    @Override
    public void irSur() {
        System.out.println("Caminas de regreso a casa.\nTal vez hoy no es un "+
                            "buen día para aventurarse.");
        System.exit(0); 
    }

    @Override
    public void irEste() {
        System.out.println("Ves árboles y nada más.");
        System.exit(0); 
    }

    @Override
    public void irOeste() {
        System.out.println("No parece haber mucha diversión en el jardín de "+
                            "los vecinos.");
        System.exit(0); 
    }
    
}