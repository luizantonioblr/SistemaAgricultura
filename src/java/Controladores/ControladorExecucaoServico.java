package Controladores;

import Negocio.Equipamentos;
import Negocio.ExecucaoServico;
import Repositorio.implementacoes.RepositorioImplementacaoExecucaoServicoBD;
import Repositorio.interfaces.RepositorioInterfaceExecucaoServico;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "ControladorES")
@SessionScoped
public class ControladorExecucaoServico {

    private RepositorioInterfaceExecucaoServico exs = null;
    private ExecucaoServico selectedES;

    public ControladorExecucaoServico() {
        this.exs = new RepositorioImplementacaoExecucaoServicoBD();
    }

    public String adicionar(ExecucaoServico execucaoservico) {
        this.exs.adicionar(execucaoservico);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Execurção do Serviço " + execucaoservico.getServico() + " Foi adicionada com Sucesso!", "Mensagem"));
        return "/MenuPrincipal.xhtml";
  
    }

    public Equipamentos[] getEquipamentos() {
        return Equipamentos.values();
    }

    public ExecucaoServico getSelectedES() {
        return selectedES;
    }

    public void setSelectedES(ExecucaoServico selectedES) {
        this.selectedES = selectedES;

    }

}
