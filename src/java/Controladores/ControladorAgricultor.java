package Controladores;

import Negocio.Agricultor;
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
        this.agricultores.adicionar(agricultor);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Agricultor " + agricultor.getNome() + " Foi cadastrado com Sucesso!", "Mensagem"));
        return "Login.xhtml";
    }
}
