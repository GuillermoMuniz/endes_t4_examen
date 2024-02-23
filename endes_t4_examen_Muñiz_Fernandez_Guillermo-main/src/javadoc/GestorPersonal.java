package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase gestor de personal con artributos contratar, despedir y modificar
 * el sueldo de empleados.
 */
public class GestorPersonal {

    private List<Empleado> empleados; // Lista de empleados gestionados por el gestor de personal

    /**
     * Constructor para crear un objeto GestorPersonal sin empleados inicialmente.
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Contratar  nuevo empleado y  añadir a la ArrayList de empleados.
     *
     * @param empleado El empleado a contratar.
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Despedir empleado con el ID específico.
     *
     * @param id El ID del empleado a despedir.
     * @return true si se despide al empleado, false si no se encuentra al empleado con un ID especifico.
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     * Cambiar el sueldo del empleado con un ID especifico.
     *
     * @param id          El ID del empleado cuyo sueldo cambia.
     * @param nuevoSueldo Establecemos un nuevo sueldo.
     * @return true si se puede cambiar el sueldo del empleado, false si no se encuentra al empleado con el ID especifico.
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Obtener una lista de empleados.
     *
     * @return lista que contiene a todos los empleados.
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
