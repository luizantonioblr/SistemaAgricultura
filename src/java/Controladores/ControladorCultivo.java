package Controladores;

import Negocio.Cultivo;
import Repositorio.implementacoes.RepositorioImplementacaoCultivoDB;
import Repositorio.interfaces.RepositorioInterfaceCultivo;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ControladorCultivo {

    private RepositorioInterfaceCultivo cultivo = null;

    public ControladorCultivo() {
        this.cultivo = new RepositorioImplementacaoCultivoDB();
    }

    public String adicionar(Cultivo cultivo) {
        this.cultivo.adiconar(cultivo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cultivo " + cultivo.getCultura() + " Foi cadastrado com Sucesso!", "Mensagem"));
        return "Menu.xhtml";
    }

}
