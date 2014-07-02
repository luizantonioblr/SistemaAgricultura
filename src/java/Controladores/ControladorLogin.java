/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Negocio.Agricultor;
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

    public String login(Agricultor agricultor) {
        RequestContext context = RequestContext.getCurrentInstance();

        if (agricultor.getEmail().equals("") || agricultor.getSenha() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o EMAIL!", ""));
        }
        if (agricultor.getSenha().equals("") || agricultor.getSenha() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite a senha!", ""));
        }
        if (agricultor.getEmail().equals("") || agricultor.getEmail() == null || agricultor.getSenha().equals("") || agricultor.getSenha() == null) {
            return "";
        }
        Agricultor s = null;
        List<Agricultor> ls = this.rs.recuperarTodos();

        for (int i = 0; i < ls.size(); i++) {
            if (agricultor.getEmail().equals(ls.get(i).getEmail())) {
                s = ls.get(i);
            }
        }

        if (s == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "SIAPE nÃ£o cadastrado!", ""));
            return "";
        }
        if (agricultor.getEmail().equals(s.getSenha())) {
            if (agricultor.getSenha().equals(s.getSenha())) {
                loggedIn = true;
                this.agricultor = s;
                this.email = s.getEmail();

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha invÃ¡lida!", ""));
                return "";
            }
        }

        context.addCallbackParam("loggedIn", loggedIn);
        return null;
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
