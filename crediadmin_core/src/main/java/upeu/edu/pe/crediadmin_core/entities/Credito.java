package upeu.edu.pe.crediadmin_core.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "credito")
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double monto;
    private Integer cuotas;
    private Double interes;
    private String estado;

    public Credito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Credito{" +
                "id=" + id +
                ", monto=" + monto +
                ", cuotas=" + cuotas +
                ", interes=" + interes +
                ", estado='" + estado + '\'' +
                '}';
    }
}
