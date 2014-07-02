package Negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@ManagedBean(name = "cultivo")
@RequestScoped
@Entity
public class Cultivo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Nome", length = 25)
    private String nome;

    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column(name = "Area", length = 10)
    private double area;

    @Column(name = "Localizacao", length = 25)
    private String localizacao;

    @OneToMany
    private List<ExecurcaoServico> execurcoes = new ArrayList<ExecurcaoServico>();

    @Deprecated
    public Cultivo() {
    }

    public Cultivo(Long id, String nome, double area, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.area = area;
        this.localizacao = localizacao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String cultura) {
        this.nome = cultura;
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

    public List<ExecurcaoServico> getExecurcoes() {
        return execurcoes;
    }

    public void setExecurcoes(List<ExecurcaoServico> execurcoes) {
        this.execurcoes = execurcoes;
    }
}
