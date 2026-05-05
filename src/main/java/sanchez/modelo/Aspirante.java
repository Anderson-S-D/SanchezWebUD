/**
 * Nombre completo: Anderson Sanchez
 */
package sanchez.modelo;

import java.io.Serializable;

public class Aspirante extends Persona implements Serializable {
    private ProgAcad programa;

    public Aspirante() {
        super();
        this.programa = new ProgAcad();
    }

    public ProgAcad getPrograma() { return programa; }
    public void setPrograma(ProgAcad programa) { this.programa = programa; }
}
