package Negocio;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean(name = "agricultor")
@SessionScoped
@Entity
public class Agricultor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "Nome", length = 50)
    private String nome;

    @Embedded
    private Endereco endereco;
    
    @Column(name = "Celular", length = 14)
    private String celular;
    
    @Column(name = "Telefone", length = 14)
    private String telefone;

    @Embedded
    private Usuario usuario = new Usuario();

    //List<Cultivo> listaCultivo = null;
    
    @Deprecated
    public Agricultor() {
    }

    public Agricultor(String nome, Endereco endereco, String celular, String telefone, Usuario usuario) {
        this.nome = nome;
        this.endereco = endereco;
        this.celular = celular;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public Agricultor(String nome, Endereco endereco, String celular, String telefone, String email, String senha) {
        this(nome, endereco, celular, telefone, new Usuario(email, senha));
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

    public void setSenha(String senha) {
        this.usuario.setSenha(senha);
    }

    public String getSenha() {
        return this.usuario.getSenha();
    }

    public void setEmail(String email) {
        this.usuario.setEmail(email);
    }

    public String getEmail() {
        return this.usuario.getEmail();
    }

    /*public List<Cultivo> getListaCultivo() {
     return listaCultivo;
     }

     public void setListaCultivo(List<Cultivo> listaCultivo) {
     this.listaCultivo = listaCultivo;
     }*/
}
