

package Repositorio.implementacoes;

import DaoHibernate.DaoManagerHiber;

import Negocio.ExecucaoServico;
import Repositorio.interfaces.RepositorioInterfaceExecucaoServico;


public class RepositorioImplementacaoExecucaoServicoBD implements RepositorioInterfaceExecucaoServico {

    @Override
    public void adicionar(ExecucaoServico execucaoservico) {
          DaoManagerHiber.persist(execucaoservico);
          
    }

       
}
