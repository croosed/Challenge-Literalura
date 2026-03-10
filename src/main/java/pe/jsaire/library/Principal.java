package pe.jsaire.library;

import org.springframework.stereotype.Component;
import pe.jsaire.library.service.LibroService;

import java.util.Scanner;

@Component
public class Principal {

    private final LibroService libroService;
    private Scanner teclado = new Scanner(System.in);

    public Principal(LibroService libroService) {
        this.libroService = libroService;
    }

    public void mostrarMenu() {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("""
                    1 - Buscar libro por título
                    2 - Listar libros
                    3 - Listar autores
                    4 - Listar libros por idioma
                    5 - Autores vivos en un año
                    0 - Salir
                    """);

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> buscarLibro();
                case 2 -> libroService.listarLibros();
                case 3 -> libroService.listarAutores();
                case 4 -> listarPorIdioma();
                case 5 -> autoresVivos();
            }
        }
    }

    private void buscarLibro() {
        System.out.println("Ingrese título:");
        String titulo = teclado.nextLine();
        libroService.buscarLibroPorTitulo(titulo);
    }

    private void listarPorIdioma() {
        System.out.println("Ingrese idioma (ej: en, es):");
        String idioma = teclado.nextLine();
        libroService.listarPorIdioma(idioma);
    }

    private void autoresVivos() {
        System.out.println("Ingrese año:");
        Integer anio = teclado.nextInt();
        libroService.autoresVivos(anio);
    }
}