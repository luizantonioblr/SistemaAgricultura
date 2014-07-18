

package Repositorio.implementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Servico;

import Repositorio.interfaces.RepositorioInterfaceServico;
import java.util.List;


public class RepositorioImplementacaoServicoBD implements RepositorioInterfaceServico {

    @Override
    public void adicionar(Servico servico) {
         DaoManagerHiber.persist(servico);
    }

   /* @Override
    public void deletar(Servico servico) {
         DaoManagerHiber.delete(servico);
    }

    @Override
    public void atualizar(Servico servico) {
         DaoManagerHiber.update(servico);
    }
*/

    @Override
    public List<Servico> recuperarTodos() {
        return (List<Servico>) DaoManagerHiber.recover("from Servico");
    }
   
    
}
