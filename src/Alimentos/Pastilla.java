package Alimentos;
/**
 *
 * @author kar
 */
public class Pastilla implements Comestible{

    @Override
    public void comer() {
        System.out.println("Tomaste la pastilla...");
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
