package Lugares;
/**
 *
 * @author kar
 */
public class Bosque implements Explorable{

    @Override
    public void irNorte() {
        System.out.println("Sólo arboles...");
        System.exit(0);
    }

    @Override
    public void irSur() {
        System.out.println("Sólo árboles...");
        System.exit(0);
    }

    @Override
    public void irEste() {
        System.out.println("Qué curioso, ves una casita muy linda.\nTal vez ahí "+
                            "pudo haberse metido el conejo blanco.");
    }

    @Override
    public void irOeste() {
        System.out.println("No parece ser un camino muy seguro.");
        System.exit(0);
    }
    
}
