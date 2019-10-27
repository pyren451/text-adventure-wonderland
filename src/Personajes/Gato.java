package Personajes;
/**
 *
 * @author kar
 */
public class Gato implements Perseguible, Conversable {

    @Override
    public void conversar() {
        System.out.println("\"Siempre llegarás a alguna parte, si caminas lo suficiente.\"");
    }

    @Override
    public void preguntar() {
        System.out.println("El gato de Cheshire comienza a reírse y desaparece "+
                            "quedando sólo su sonrisa durante unos instantes.");
    }
    
    public void hablar(){
        System.out.println("\"¿Que no sabes qué camino seguir?\nEso sólo depende de "+
                            "a dónde quieras llegar, Alicia...\"");
    }
    
}
