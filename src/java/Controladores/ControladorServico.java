package Controladores;

import Negocio.Servico;
import Repositorio.implementacoes.RepositorioImplementacaoServicoBD;
import Repositorio.interfaces.RepositorioInterfaceServico;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "ControladorS")
@SessionScoped
public class ControladorServico {
    
     private RepositorioInterfaceServico servicos = null;
     private String Mensagem="";
     private Servico selectedS;

    public ControladorServico() {
        this.servicos = new RepositorioImplementacaoServicoBD();
    }

    public String adicionar(Servico servico) {
        this.servicos.adicionar(servico);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Serviço " + servico.getNomeServico()+ " Foi adicionado com Sucesso!", "Mensagem"));
        return "Menu.xhtml";
    }

   /* public String deletar(Servico servico) {
        this.servicos.deletar(servico);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Serviço " + servico.getNomeServico()+ " Foi deletada com Sucesso!", "Mensagem"));
        return "Menu.xhtml";
     
    }

    public String atualizar(Servico servico) {
        this.servicos.atualizar(servico);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Serviço " + servico.getNomeServico()+ " Foi atualizada com Sucesso!", "Mensagem"));
        return "Menu.xhtml";
    }                 */

    /**
     * @return the selectedE
     */
    public Servico getSelectedS() {
        return selectedS;
    }

    
    public void setSelectedS(Servico selectedS) {
        this.selectedS = selectedS;
    }

    /**
     * @return the Mensagem
     */
    public String getMensagem() {
        return Mensagem;
    }

    /**
     * @param Mensagem the Mensagem to set
     */
    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    
}
