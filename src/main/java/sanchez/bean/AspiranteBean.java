/**
 * Nombre completo: Anderson Sanchez
 */
package sanchez.bean;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import sanchez.modelo.Aspirante;
import sanchez.modelo.AspiranteDAO;
import sanchez.modelo.ProgAcad;
import sanchez.modelo.ProgAcadDAO;
import java.io.Serializable;
import java.util.List;

@Named("aspiranteBean")
@SessionScoped
public class AspiranteBean implements Serializable {
    private Aspirante aspirante = new Aspirante();
    private AspiranteDAO aspiranteDAO = new AspiranteDAO();
    private ProgAcadDAO progAcadDAO = new ProgAcadDAO();
    private int idProgramaSeleccionado;

    public String registrar() {
        // Buscar el programa seleccionado
        for (ProgAcad p : progAcadDAO.getListaProgramas()) {
            if (p.getId() == idProgramaSeleccionado) {
                aspirante.setPrograma(p);
                break;
            }
        }
        aspiranteDAO.agregarAspirante(aspirante);
        aspirante = new Aspirante(); // Limpiar para el siguiente registro
        return "listado"; // Navegar a listado.xhtml
    }

    public Aspirante getAspirante() { return aspirante; }
    public void setAspirante(Aspirante aspirante) { this.aspirante = aspirante; }
    public List<Aspirante> getListaAspirantes() { return aspiranteDAO.getListaAspirantes(); }
    public List<ProgAcad> getListaProgramas() { return progAcadDAO.getListaProgramas(); }
    public int getIdProgramaSeleccionado() { return idProgramaSeleccionado; }
    public void setIdProgramaSeleccionado(int idProgramaSeleccionado) { this.idProgramaSeleccionado = idProgramaSeleccionado; }
}
