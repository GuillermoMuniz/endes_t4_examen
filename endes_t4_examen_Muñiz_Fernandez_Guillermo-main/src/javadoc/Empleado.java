package javadoc;

/**
 *  Clase  para representar a un empleado con sus atributos: nombre, identificación y sueldo.
 */
public class Empleado {

    // Añadimos los atributos de la clase
    private String nombre; // Nombre del empleado
    private String id; // Identificación del empleado
    private double sueldo; // Sueldo del empleado

    /**
     *  Generamos constructor para crear el objeto Empleado con sus atributos.
     *
     * @param nombre   nombre del empleado.
     * @param id       identificación del empleado.
     * @param sueldo   sueldo del empleado.
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }

    /**
     * Obtener el nombre del empleado.
     *
     * @return  devuelve nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     *
     * @param nombre  para establecer el nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener el ID del empleado.
     *
     * @return el ID del empleado.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtener el sueldo del empleado.
     *
     * @return devuelve sueldo del empleado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establede el sueldo.
     *
     * @param sueldo  sueldo del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Incrementar el sueldo del empleado en una cantidad determinada.
     *
     * @param incremento  Una cantidad a incrementar el sueldo.
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     *
     *
     * @return Una representación en cadena del objeto Empleado.
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
