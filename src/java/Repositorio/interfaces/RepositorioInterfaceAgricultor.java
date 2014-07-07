package Repositorio.interfaces;

import Negocio.Agricultor;
import java.util.List;

public interface RepositorioInterfaceAgricultor {

    public Agricultor recuperar(Long id);

    public void adicionar(Agricultor agricultor);

    public void deletar(Agricultor agricultor);

    public void atualizar(Agricultor agricultor);
    
    public List<Agricultor> recuperarTodos();
}
