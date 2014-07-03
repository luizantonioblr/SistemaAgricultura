

package Repositorio.interfaces;

import Negocio.Etapa;
import Negocio.ExecucaoServico;


public interface RepositorioInterfaceExecucaoServico {
     public void adicionar(ExecucaoServico es);
     public void recuperarPorEtapa(Etapa etapa);
     
     
}
