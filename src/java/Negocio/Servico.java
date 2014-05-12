package Negocio;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Servico {

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

//    @Override
//    public String toString() {
//        return "Servico{" + "nome=" + nome + ", etapa=" + etapa + '}';
//    }

}
