package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */


class Report {

    void printReport() {
        printTitulo();


        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        printConclusion();
    }

    private void printTitulo() {
        System.out.println("Título del Reporte");
    }

    private void printConclusion() {
        System.out.println("Conclusión del Reporte");
    }
}
