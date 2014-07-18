package Negocio;

import Converter.AbstractEntity;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean(name = "servico")
@RequestScoped
@Entity
public class Servico extends AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Nome", length = 15)
    private String nome;

    @Enumerated(EnumType.STRING)
    private Etapa etapa;

    @Deprecated
    public Servico() {
    }

    public Servico(String nome, Etapa etapa) {
        this.nome = nome;
        this.etapa = etapa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
