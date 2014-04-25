package Negocio;

import java.util.Date;
import java.util.List;

public class Cultivo {

    private Long id;
    private String cultura;
    private Date dataInicio;
    private double area;
    private String local;
    private List<ExecucaoServico> execucoes = null;

    @Deprecated
    public Cultivo() {
    }

    public Cultivo(Long id, String cultura, Date dataInicio, double area, String local) {
        this.id = id;
        this.cultura = cultura;
        this.dataInicio = dataInicio;
        this.area = area;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<ExecucaoServico> getExecucoes() {
        return execucoes;
    }

    public void setExecucoes(List<ExecucaoServico> execucoes) {
        this.execucoes = execucoes;
    }

    @Override
    public String toString() {
        String r = "Cultivo{" + "cultura=" + cultura + ", dataInicio=" + dataInicio + ", area=" + area + ", local=" + local + ", execucoes=";

        for (ExecucaoServico es : execucoes) {
            r = r + es;
        }

        r = r + "}";

        return r;
    }
}
