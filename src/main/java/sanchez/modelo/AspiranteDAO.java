/**
 * Nombre completo: Anderson Sanchez
 */
package sanchez.modelo;

import java.util.ArrayList;
import java.util.List;

public class AspiranteDAO {
    private static List<Aspirante> listaAspirantes = new ArrayList<>();
    private static List<ProgAcad> listaProgramas = new ArrayList<>();

    static {
        listaProgramas.add(new ProgAcad(1, "Ingeniería de Sistemas"));
        listaProgramas.add(new ProgAcad(2, "Ingeniería Electrónica"));
        listaProgramas.add(new ProgAcad(3, "Ingeniería Industrial"));
        listaProgramas.add(new ProgAcad(4, "Ingeniería Catastral"));
    }

    public void agregarAspirante(Aspirante aspirante) {
        listaAspirantes.add(aspirante);
    }

    public List<Aspirante> getListaAspirantes() {
        return listaAspirantes;
    }

    public List<ProgAcad> getListaProgramas() {
        return listaProgramas;
    }
}
