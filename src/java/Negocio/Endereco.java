package Negocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco implements Serializable {

    @Column(name = "Estado", length = 30)
    private String estado;

    @Column(name = "Cidade", length = 30)
    private String cidade;

    @Column(name = "Bairro", length = 30)
    private String bairro;

    @Column(name = "Logradouro", length = 150)
    private String logradouro;

    @Column(name = "Numero", length = 5)
    private String numero;

    @Column(name = "CEP", length = 12)
    private String cep;

    @Deprecated
    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String logradouro, String numero, String cep) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
