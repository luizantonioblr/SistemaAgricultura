package Negocio;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import sun.misc.BASE64Encoder;



@Embeddable
public class Usuario implements Serializable {

    @Column(name = "Email", length = 50)
    private String email;
    
    @Column(name = "Senha", length = 50)
    private String senha;

    @Deprecated
    public Usuario() {
    }

    public Usuario(String Email, String senha) {

        this.email = Email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

  

}
