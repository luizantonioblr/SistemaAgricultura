package Negocio;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ManagedBean(name = "agricultor")
public class Agricultor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @Embedded
    private Endereco endereco;
    private String celular;
    private String telefone;

    @Embedded
    private Usuario usuario;
    
    List<Cultivo> listaCultivo = null;

    @Deprecated
    public Agricultor() {
    }

    public Agricultor(Long id, String nome, Endereco endereco, String celular, String telefone, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.celular = celular;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Cultivo> getListaCultivo() {
        return listaCultivo;
    }

    public void setListaCultivo(List<Cultivo> listaCultivo) {
        this.listaCultivo = listaCultivo;
    }

    @Override
    public String toString() {
        return "Agricultor{" + "nome=" + nome + ", endereco=" + endereco + ", telefone1=" + celular + ", telefone2=" + telefone + ", listaCultivo=" + listaCultivo + '}';
    }

}