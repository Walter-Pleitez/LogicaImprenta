package outlook.walter.interfaces.imprenta;

import outlook.walter.interfaces.imprenta.modelo.*;
import static outlook.walter.interfaces.imprenta.modelo.Genero.*;

public class MainImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Walter Pleitez", "Programador Backend", "Dockerización de apps...");
        cv.addExperiencias("Java");
        cv.addExperiencias("BD MySQL");
        cv.addExperiencias("Spring Boot");
        cv.addExperiencias("Docker Compose");

        Libro libro = new Libro("Erich Gamma", "Patrones de Diseño: Elementos reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Oswaldo", "Torres", "Estudio de Arquitecturas de Software ");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.Imprimir());
    }
}
