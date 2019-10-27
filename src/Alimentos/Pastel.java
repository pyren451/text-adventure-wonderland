package Alimentos;
/**
 *
 * @author kar
 */
public class Pastel  implements Comestible {

    @Override
    public void comer() {
        System.out.println("Comiste un poco de pastel...");
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
