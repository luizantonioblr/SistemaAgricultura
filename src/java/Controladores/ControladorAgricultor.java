package Controladores;

import Negocio.Agricultor;
import Negocio.Criptografia;
import Repositorio.implementacoes.RepositorioImplementacaoAgricultorDB;
import Repositorio.interfaces.RepositorioInterfaceAgricultor;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "ControladorA")
@SessionScoped
public class ControladorAgricultor {

    private RepositorioInterfaceAgricultor agricultores = null;

    public ControladorAgricultor() {
        this.agricultores = new RepositorioImplementacaoAgricultorDB();
    }

    public String adicionar(Agricultor agricultor) {
        if (agricultor.getNome().equals("") || agricultor.getNome() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o Nome!", ""));
            return "null";
        } else if (agricultor.getNome().equals("") && agricultor.getNome() == null && agricultor.getCelular().equals("") && agricultor.getCelular() == null && agricultor.getUsuario().getEmail().equals("")
                && agricultor.getUsuario().getSenha().equals("") && agricultor.getUsuario().getSenha() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Por Favor digite os dados!", ""));

        } else if (agricultor.getCelular().equals("") || agricultor.getCelular() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o Celular!", ""));
            return "null";
        } else if (agricultor.getUsuario().getEmail().equals("") || agricultor.getUsuario().getEmail() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o Email!", ""));
            return "null";
        } else if (agricultor.getUsuario().getSenha().equals("") || agricultor.getUsuario().getSenha() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite a Senha!", ""));
        } else if (validarEmail(agricultor.getUsuario().getEmail()) == false || agricultor.getUsuario().getEmail() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o Email Novamente!!!", ""));
        }

        agricultor.getUsuario().setSenha(Criptografia.criptografar(agricultor.getUsuario().getSenha()));
        this.agricultores.adicionar(agricultor);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Agricultor " + agricultor.getNome() + " Foi cadastrado com Sucesso!", "Mensagem"));
        return "Login.xhtml";

    }

    private boolean validarEmail(String email) {
        String padrao = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (padrao.matches(email)) {
            return true;
        }

        return false;

    }
}
