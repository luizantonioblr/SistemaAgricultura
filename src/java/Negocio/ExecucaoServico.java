package Negocio;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ExecucaoServico {

    private Servico servico;
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

//    @Override
//    public String toString() {
//        return "ExecucaoServico{" + "servico=" + servico + ", periodo=" + periodo + ", custo=" + custo + '}';
//    }
}
