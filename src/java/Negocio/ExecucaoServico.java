package Negocio;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@ManagedBean(name = "ExecurcaoServico")
@RequestScoped
@Entity
public class ExecucaoServico implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Servico servico;

    @Embedded
    private Periodo periodo;

    @Column(name = "Custo", length = 5)
    private double custo;

    @Enumerated(EnumType.STRING)
    private Equipamentos equipamentos;

    @Deprecated
    public ExecucaoServico() {
    }

    public ExecucaoServico(Servico servico, Periodo periodo, double custo, Equipamentos equipamentos) {
        this.servico = servico;
        this.periodo = periodo;
        this.custo = custo;
        this.equipamentos = equipamentos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Equipamentos getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Equipamentos equipamentos) {
        this.equipamentos = equipamentos;
    }

}
