package Controladores;

import Negocio.Agricultor;
import Negocio.Criptografia;
import Negocio.Usuario;
import Repositorio.implementacoes.RepositorioImplementacaoAgricultorDB;
import Repositorio.interfaces.RepositorioInterfaceAgricultor;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "controladorLogin")
@SessionScoped
public class ControladorLogin implements Serializable {

    private RepositorioInterfaceAgricultor rs;
    private boolean loggedIn = false;
    private Agricultor agricultor;
    private boolean administrador = false;
    private String email;

    public ControladorLogin() {
        rs = new RepositorioImplementacaoAgricultorDB();
    }

    public String login(Usuario agri) {
        agri.setSenha(Criptografia.criptografar(agri.getSenha()));
        RequestContext context = RequestContext.getCurrentInstance();
        if (agri.getEmail().equals("") || agri.getEmail() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o EMAIL!", ""));
        }
        if (agri.getSenha().equals("") || agri.getSenha() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite a senha!", ""));
        }
        if (agri.getEmail().equals("") || agri.getEmail() == null || agri.getSenha().equals("") || agri.getSenha() == null) {
            return null;
        }
        Agricultor s = null;
        List<Agricultor> ls = this.rs.recuperarTodos();

        for (int i = 0; i < ls.size(); i++) {
            if (agri.getEmail().equals(ls.get(i).getEmail())) {
                s = ls.get(i);
            }
        }

        if (s == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Email não cadastrado!", ""));
            return "";
        }
        if (agri.getEmail().equals(s.getSenha())) {
            if (agri.getSenha().equals(s.getSenha())) {
                loggedIn = true;
                this.agricultor = s;
                this.email = s.getEmail();

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha invÃ¡lida!", ""));
                return "";
            }
        }
        loggedIn = true;
        context.addCallbackParam("loggedIn", loggedIn);
        return "/MenuPrincipal.xhtml";
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }

    public void sair() {
        this.loggedIn = false;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
