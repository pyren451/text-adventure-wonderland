package Lugares;
/**
 *
 * @author kar
 */
public class Madriguera implements Explorable{

    @Override
    public void irNorte() {
        System.out.println("Resbalas por un largo túnel y llegas a otro lugar...");
    }

    @Override
    public void irSur() {
        System.out.println("¡Desde aquí también se ve tu casa!");
        System.exit(0);
    }

    @Override
    public void irEste() {
        System.out.println("Hay mucho lodo alrededor, te manchaste los zapatos.");
        System.exit(0);
    }

    @Override
    public void irOeste() {
        System.out.println("Parece que el conejo dejó un poco de comida aquí.");
        System.exit(0);
    }
    
}
