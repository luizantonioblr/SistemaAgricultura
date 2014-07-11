package Controladores;

import Negocio.Equipamentos;
import Negocio.Etapa;
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
    private String Mensagem = "";
    private ExecucaoServico selectedES;
   
    public ControladorExecucaoServico() {
        this.exs = new RepositorioImplementacaoExecucaoServicoBD();

    }

    public String adicionar(ExecucaoServico es) {
        this.exs.adicionar(es);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Execurção do Serviço " + es.getServico() + " Foi adicionada com Sucesso!", "Mensagem"));
        return "Menu.xhtml";
    }

    /*public void recuperarPorEtapa(Etapa etapa) {
        this.exs.recuperarPorEtapa(etapa);
    }*/
    
    public Etapa[] getEtapa(){  
        return Etapa.values();  
    } 
    public Equipamentos[] getEquipamentos(){
        return Equipamentos.values();
    } 

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    public ExecucaoServico getSelectedES() {
        return selectedES;
    }

    public void setSelectedES(ExecucaoServico selectedES) {
        this.selectedES = selectedES;

    }

}
