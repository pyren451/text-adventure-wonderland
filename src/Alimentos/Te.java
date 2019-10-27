package Alimentos;
/**
 *
 * @author kar
 */
public class Te implements Comestible {

    @Override
    public void comer() {
        System.out.println("Tomaste un sorbo de té...");
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
