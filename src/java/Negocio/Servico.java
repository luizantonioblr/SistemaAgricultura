package Negocio;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Sherlle Silva
 */
@ManagedBean(name = "servico")
@RequestScoped
@Entity

public class Servico implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NomeServico", length = 15)
    private String nomeServico;

    @Enumerated(EnumType.STRING)
    private Etapa etapa;

    @Deprecated
    public Servico() {
    }

    public Servico(String nomeServico, Etapa etapa) {
        this.nomeServico = nomeServico;

        this.etapa = etapa;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
