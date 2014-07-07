package Controladores;

import Negocio.Cultivo;
import Repositorio.implementacoes.RepositorioImplementacaoCultivoDB;
import Repositorio.interfaces.RepositorioInterfaceCultivo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "ControladorC")
@SessionScoped
public class ControladorCultivo {

    private RepositorioInterfaceCultivo cultivo = null;
    private Cultivo selectedC;

    public ControladorCultivo() {
        this.cultivo = new RepositorioImplementacaoCultivoDB();
    }

    public String adicionar(Cultivo cultivo) {
        if (cultivo.getNome().equals("") || cultivo.getNome() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o Nome!", ""));
            return "null";
        } else if (cultivo.getLocalizacao().equals("") || cultivo.getLocalizacao() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o Local!", ""));
            return "null";
        } else if (cultivo.getArea() == 0.0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite a Area!", ""));
            return "null";
        }
        this.cultivo.adiconar(cultivo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cultivo " + cultivo.getNome() + " Foi cadastrado com Sucesso!", "Mensagem"));
        return "MenuPrincipal.xhtml";
    }

    public String deletar(Cultivo cultivo) {
        this.cultivo.deletar(cultivo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cultivo " + cultivo.getNome() + " Foi Deletado com Sucesso!", "Mensagem"));
        return "MostrarTodosCultivos.xhtml";
    }

    public String atualizar(Cultivo cultivo) {
        if (cultivo.getNome().equals("") || cultivo.getNome() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o novo Nome!", ""));
            return "";
        } else if (cultivo.getLocalizacao().equals("") || cultivo.getLocalizacao() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite o novo Local!", ""));
            return "";
        } else if (cultivo.getArea() == 0.0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Digite a nova Area", ""));
            return "";
        }
        this.cultivo.atualizar(cultivo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cultivo " + cultivo.getNome() + " Foi Atualizado com Sucesso!", "Mensagem"));
        return "MostrarTodosCultivos.xhtml";
    }

    public Cultivo recuperar(Long id) {
        return this.cultivo.recuperar(id);
    }

    public List<Cultivo> recuperarTodos() {
        return this.cultivo.recuperarTodos();
    }

    public Cultivo getSelectedC() {
        return selectedC;
    }

    public void setSelectedC(Cultivo selectedC) {
        this.selectedC = selectedC;
    }

}
