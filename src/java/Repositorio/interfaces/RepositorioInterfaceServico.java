

package Repositorio.interfaces;

import Negocio.Servico;
import java.util.List;




public interface RepositorioInterfaceServico {
    
    public void adicionar(Servico servico);

   /* public void deletar(Servico servico);

    public void atualizar(Servico servico);*/
    
    public List<Servico> recuperarTodos();
    
}
