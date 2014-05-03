package Repositorio.interfaces;

import Negocio.Cultivo;
import java.util.List;

public interface RepositorioInterfaceCultivo {

    public void adiconar(Cultivo cultivo);

    public void deletar(Cultivo cultivo);

    public void atualizar(Cultivo cultivo);

    public Cultivo recuperar(Long id);

    public List<Cultivo> recuperarTodos();
}
