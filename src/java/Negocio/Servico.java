package Negocio;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Servico {

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
    public String toString() {
        return "Servico{" + "nome=" + nome + ", etapa=" + etapa + '}';
    }

}
