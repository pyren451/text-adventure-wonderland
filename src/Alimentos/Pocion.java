package Alimentos;
/**
 *
 * @author kar
 */
public class Pocion implements Comestible {

    @Override
    public void beber() {
        System.out.println("Uuhh... has bebido la poción y empiezas a sentirte "+
                            "un tanto extraña... tal vez no fue buena idea.\n"+
                            "Miras a tus pies y éstos comienzan a hacerse pequeños "+
                            "al igual que tus brazos y tu cabeza. Esto es extraño.");
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ignorar() {
        System.out.println("Al parecer ya no tienes ganas de seguir adelante");
        System.exit(0);
    }
    
}
