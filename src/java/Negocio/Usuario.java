package Negocio;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.persistence.Embeddable;
import javax.swing.JOptionPane;
import sun.misc.BASE64Encoder;

@Embeddable
public class Usuario implements Serializable {

    private String email;
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

    public static String encripta(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(senha.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();

            return encoder.encode(digest.digest());
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return senha;
        }
    }

}
