package com.marriaga.poointerfaces.imprenta;

import com.marriaga.poointerfaces.imprenta.modelo.*;

import static com.marriaga.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen laboral...",
                new Persona("Miguel", "Arriaga"), "Programador");
        cv.addExperiencia("Java")
                .addExperiencia("OracleDB")
                .addExperiencia("Spring Framework")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Juan", " Torres"),
                "Patrones de diseño", PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Fábrica"))
                .addPagina(new Pagina("Patrón Compositor"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",
                new Persona("Andrés", " Pérez"),
                new Persona("James", "Grohl"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
