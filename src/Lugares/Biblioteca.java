package Lugares;
/**
 *
 * @author kar
 */
public class Biblioteca implements Explorable{

    @Override
    public void irNorte() {
        System.out.println("Giras al norte y ves una mesa con muchos libros");
    }

    @Override
    public void irSur() {
        System.out.println("Giras al sur y ves una puerta");
    }

    @Override
    public void irEste() {
        System.out.println("Giras al este y ves una mesa con un par de frascos");
    }

    @Override
    public void irOeste() {
        System.out.println("Giras al oeste y ves sólo un cuadro en la pared");
    }

    
}
