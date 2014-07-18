package Controladores;

import Negocio.Etapa;
import Negocio.Servico;
import Repositorio.implementacoes.RepositorioImplementacaoServicoBD;
import Repositorio.interfaces.RepositorioInterfaceServico;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "ControladorS")
@SessionScoped
public class ControladorServico {

    private RepositorioInterfaceServico servico = null;
    private Servico selectedS;

    public ControladorServico() {
        this.servico = new RepositorioImplementacaoServicoBD();
    }

    public String adicionar(Servico servico) {
        this.servico.adicionar(servico);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Serviço " + servico.getNome() + " Foi adicionado com Sucesso!", "Mensagem"));
        return "/MenuPrincipal.xhtml";
    }

    public List<Servico> recuperarTodos() {
        return this.servico.recuperarTodos();
    }

    public Etapa[] getEtapas() {
        return Etapa.values();
    }

    public Servico getSelectedS() {
        return selectedS;
    }

    public void setSelectedS(Servico selectedS) {
        this.selectedS = selectedS;
    }

}
