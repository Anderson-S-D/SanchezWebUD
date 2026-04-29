package sanchez.bean;

import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("cdt")
@ViewScoped
public class CDT implements Serializable {

    private static final long serialVersionUID = 1L;
    private double inversion;
    private double interes;
    private double plazo;
    private double ganancia;
    private double valorFuturo;
    private double impuesto;
    private double valorFinal;
    private double gananciaNeta;
    private static final double ANIO = 360;

    public CDT() {
        super();
    }

    public void calcular() {
        // Cálculo de ganancia bruta
        ganancia = inversion * (interes / 100.0 * (plazo / ANIO));
        
        // Cálculo de impuesto (4% sobre la ganancia)
        impuesto = ganancia * 0.04;
        
        // Valor futuro antes de impuestos
        valorFuturo = inversion + ganancia;
        
        // Valor final al vencimiento (después de impuestos)
        valorFinal = valorFuturo - impuesto;
        
        // Ganancia neta (después de impuestos)
        gananciaNeta = ganancia - impuesto;
        
        System.out.println("Cálculo realizado - Ganancia: " + ganancia + ", Valor Final: " + valorFinal);
    }

    // Getters y Setters
    public double getInversion() { return inversion; }
    public void setInversion(double inversion) { this.inversion = inversion; }

    public double getInteres() { return interes; }
    public void setInteres(double interes) { this.interes = interes; }

    public double getPlazo() { return plazo; }
    public void setPlazo(double plazo) { this.plazo = plazo; }

    public double getGanancia() { return ganancia; }
    public void setGanancia(double ganancia) { this.ganancia = ganancia; }

    public double getValorFuturo() { return valorFuturo; }
    public void setValorFuturo(double valorFuturo) { this.valorFuturo = valorFuturo; }

    public double getImpuesto() { return impuesto; }
    public void setImpuesto(double impuesto) { this.impuesto = impuesto; }

    public double getValorFinal() { return valorFinal; }
    public void setValorFinal(double valorFinal) { this.valorFinal = valorFinal; }

    public double getGananciaNeta() { return gananciaNeta; }
    public void setGananciaNeta(double gananciaNeta) { this.gananciaNeta = gananciaNeta; }
}
