package Negocio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@ManagedBean(name = "cultivo")
@SessionScoped
@Entity
@Table
public class Cultivo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Nome da Cultura", length = 25)
    private String cultura;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "Area", length = 10)
    private double area;
    @Column(name = "Local", length = 25)
    private String local;
    //private List<ExecucaoServico> execucoes = null;

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

    /*public List<ExecucaoServico> getExecucoes() {
     return execucoes;
     }

     public void setExecucoes(List<ExecucaoServico> execucoes) {
     this.execucoes = execucoes;
     }*/
    @Override
    public String toString() {
        String r = "Cultivo{" + "cultura=" + cultura + ", dataInicio=" + dataInicio + ", area=" + area + ", local=" + local + ", execucoes=";

        /*for (ExecucaoServico es : execucoes) {
         r = r + es;
         }*/
        r = r + "}";

        return r;
    }
}
