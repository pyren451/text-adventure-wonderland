package Alimentos;
/**
 *
 * @author kar
 */
public class Galleta implements Comestible {

    @Override
    public void comer() {
        System.out.println("Mordiste la galleta...");
    }

    @Override
    public void beber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ignorar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
