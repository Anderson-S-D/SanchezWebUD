/**
 * Nombre completo: Anderson Sanchez
 */
package sanchez.modelo;

import java.util.ArrayList;
import java.util.List;

public class AspiranteDAO {
    private static List<Aspirante> listaAspirantes = new ArrayList<>();

    public void agregarAspirante(Aspirante aspirante) {
        listaAspirantes.add(aspirante);
    }

    public List<Aspirante> getListaAspirantes() {
        return listaAspirantes;
    }
}
