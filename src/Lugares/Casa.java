package Lugares;

/**
 *
 * @author kar
 */
public class Casa implements Explorable{

    @Override
    public void irNorte() {
        System.out.println("Nada divertido...");
    }

    @Override
    public void irSur() {
        System.out.println("La puerta que te lleva de regreso al jardín...");
    }

    @Override
    public void irEste() {
        System.out.println("Nada interesante...");
    }

    @Override
    public void irOeste() {
        System.out.println("Las paredes aburridas de siempre...");
    }
    
}
