package Negocio;

public class ExecucaoServico {

    private Servico servico;
    private Periodo periodo;
    private double custo;

    @Deprecated
    public ExecucaoServico() {
    }

    public ExecucaoServico(Servico servico, Periodo periodo, double custo) {
        this.servico = servico;
        this.periodo = periodo;
        this.custo = custo;
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

    @Override
    public String toString() {
        return "ExecucaoServico{" + "servico=" + servico + ", periodo=" + periodo + ", custo=" + custo + '}';
    }

}
