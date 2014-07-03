

package Repositorio.implementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Etapa;
import Negocio.ExecucaoServico;
import Repositorio.interfaces.RepositorioInterfaceExecucaoServico;


public class RepositorioImplementacaoExecucaoServicoBD implements RepositorioInterfaceExecucaoServico {

    @Override
    public void adicionar(ExecucaoServico es) {
          DaoManagerHiber.persist(es);
          
    }

    @Override
    public void recuperarPorEtapa(Etapa etapa) {
        DaoManagerHiber.persist(etapa);
    }
    
    
    
    
}
