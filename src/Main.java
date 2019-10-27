import Alimentos.Pocion;
import Lugares.Bosque;
import Lugares.Jardin;
import Lugares.Madriguera;
import Personajes.Gato;
import Personajes.Sombrerero;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("AVENTURA DE TEXTO\n");
        System.out.println("Te llamas Alicia y eres una niña muy inquieta. \n"+
                "Cierto día, te encuentras leyendo un libro en el "+
                "jardín y algo llama tu atención.\nA lo lejos, ves "+
                "que un conejo blanco se mueve entre los árboles.\n"+
                "(¿acaso tenía un reloj de bolsillo entre las patitas?)");

        Jardin tuJardin = new Jardin();

        System.out.println("1. Ir al norte\n2. Ir al este\n3. Ir al oeste\n"+
                "4. Ir al sur\nElige: ");

        int res = s.nextInt();

        switch(res){
            case 1:
                tuJardin.irNorte();
                break;
            case 2:
                tuJardin.irEste();
                break;
            case 3:
                tuJardin.irOeste();
                break;
            case 4:
                tuJardin.irSur();
                break;
            default:
                System.out.println("No es una opción válida para ti.");
                System.exit(0);
        }

        Madriguera madriguera = new Madriguera();
        System.out.println("Ahora que estás frente a la madriguera, podrías:\n");

        System.out.println("1. Ir al norte\n2. Ir al este\n3. Ir al oeste\n"+
                "4. Ir al sur\nElige: ");

        int res1 = s.nextInt();

        switch(res1){
            case 1:
                madriguera.irNorte();
                break;
            case 2:
                madriguera.irEste();
                break;
            case 3:
                madriguera.irOeste();
                break;
            case 4:
                madriguera.irSur();
                break;
            default:
                System.out.println("No es una opción válida para ti.");
                System.exit(0);
        }

        Bosque tuBosque = new Bosque();
        System.out.println("mmm... te levantas un poco desconcertada, miras a "+
                "tu alrededor y estás en un bosque. \"No estaría "
                + "mal explorarlo un poco\", piensas");

        System.out.println("1. Ir al norte\n2. Ir al este\n3. Ir al oeste\n"+
                "4. Ir al sur\nElige: ");

        int res2 = s.nextInt();

        switch(res2){
            case 1:
                tuBosque.irNorte();
                break;
            case 2:
                tuBosque.irEste();
                break;
            case 3:
                tuBosque.irOeste();
                break;
            case 4:
                tuBosque.irSur();
                break;
            default:
                System.out.println("No es una opción válida para ti.");
                System.exit(0);
        }

        System.out.println("Entras a la casita y el conejo blanco no está.\n"+
                "Al fondo de la primera habitación ves una mesa, "+
                "sobre ella hay muchos objetos.\nTe acercas y ves "+
                "un platito con galletas. Guardas un par de éstas, "+
                "tal vez más tarde te dé hambre.\nTambién hay una "+
                "poción que tiene un letrero que dice: \"Bébeme\"");

        Pocion tuPocion = new Pocion();
        System.out.println("1. Beber\n2. Ignorar\nElige: ");

        int res4 = s.nextInt();

        switch(res4){
            case 1:
                tuPocion.beber();
                break;
            case 2:
                tuPocion.ignorar();
                break;
            default:
                System.out.println("No es una opción válida para ti.");
                System.exit(0);
        }

        System.out.println("Ahora que mides diez centímetros, te das cuenta de "+
                "que hay una puerta debajo de la mesa.\n¡Genial! al "+
                "final resultó buena idea seguir la indicación de la "+
                "bebida.\nMovida por la curiosidad, cruzas la puerta "+
                "y ves otro bosque, pero tiene algo mágico...\n");

        System.out.println("Caminas un poco y encuentras otra casita muy agradable; "+
                "en el jardín parece haber una celebración,\nencuentras "+
                "a dos curiosos personajes...");

        Sombrerero s1 = new Sombrerero();
        System.out.println("1. Conversar\n2. Preguntar sobre conejo blanco\nElige: ");

        int res5 = s.nextInt();

        switch(res5){
            case 1:
                s1.conversar();
                break;
            case 2:
                s1.preguntar();
                break;
            default:
                System.out.println("No es una opción válida para ti.");
                System.exit(0);
        }

        System.out.println("\nAl parecer están locos, no te "+
                "dieron información valiosa, pero han sido amables "+
                "y te invitaron a tomar el té con ellos.");

        System.out.println("\nAún no puedes dejar atrás la curiosidad que te "+
                "provocó ver al conejo blanco con su reloj y recuerdas\n"+
                "haber escuchado que se quejaba sobre el tiempo, ¿dónde "+
                "se habrá metido?");

        System.out.println("\nLuego de tomar el té sigues tu camino por el bosque "+
                "y escuchas una risa entre las ramas de un árbol.");

        Gato cheshire = new Gato();
        cheshire.hablar();

        System.out.println("Te asustas al escuchar las palabras del gato, pero aún tienes "+
                "valor para acercarte a él.");

        System.out.println("1. Conversar\n2. Preguntar sobre conejo blanco\nElige: ");

        int res6 = s.nextInt();

        switch(res6){
            case 1:
                cheshire.conversar();
                break;
            case 2:
                cheshire.preguntar();
                break;
            default:
                System.out.println("No es una opción válida para ti.");
                System.exit(0);
        }

        System.out.println("Piensas: \"Todos aquí están muy locos\"");
    }
}
