package Negocio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@ManagedBean(name = "cultivo")
@RequestScoped
@Entity
public class Cultivo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "NomeDaCultura", length = 25)
    private String Cultura;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "Area", length = 10)
    private double area;
    @Column(name = "Localizacao", length = 25)
    private String localizacao;
    //private List<ExecucaoServico> execucoes = null;

    @Deprecated
    public Cultivo() {
    }

    public Cultivo(Long id, String cultura, Date dataInicio, double area, String localizacao) {
        this.id = id;
        this.Cultura = cultura;
        this.dataInicio = dataInicio;
        this.area = area;
        this.localizacao = localizacao;
    }

    public Long getId() {
        return id;
    }

    public String getCultura() {
        return Cultura;
    }

    public void setCultura(String cultura) {
        this.Cultura = cultura;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /*public List<ExecucaoServico> getExecucoes() {
     return execucoes;
     }

     public void setExecucoes(List<ExecucaoServico> execucoes) {
     this.execucoes = execucoes;
     }*/
//    @Override
//    public String toString() {
//        String r = "Cultivo{" + "cultura=" + cultura + ", dataInicio=" + dataInicio + ", area=" + area + ", local=" + localizacao + ", execucoes=";
//
//        /*for (ExecucaoServico es : execucoes) {
//         r = r + es;
//         }*/
//        r = r + "}";
//
//        return r;
//    }
}
