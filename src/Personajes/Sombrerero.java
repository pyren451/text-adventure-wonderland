package Personajes;
/**
 *
 * @author kar
 */
public class Sombrerero implements Conversable{

    @Override
    public void conversar() {
        System.out.println("El sombrerero responde: \n"+
                            "\"¡¡Estamos celebrando un feliz no cumpleaños!!\"");
    }

    @Override
    public void preguntar() {
        System.out.println("La liebre responde: \n"+
                            "\"Tal vez hemos visto al conejo blanco... o tal vez "+
                            "no, no lo tenemos muy claro ya,\ntal vez se fue por "+
                            "aquella dirección o por la del otro lado... pero no "+
                            "podríamos decirlo con seguridad\"");
    }
    
}
