package Repositorio.implementacoes;

import DaoHibernate.DaoManagerHiber;
import Negocio.Cultivo;
import Repositorio.interfaces.RepositorioInterfaceCultivo;
import java.util.List;

public class RepositorioImplementacaoCultivoDB implements RepositorioInterfaceCultivo {

    @Override
    public void adiconar(Cultivo cultivo) {
        DaoManagerHiber.persist(cultivo);
    }

    @Override
    public void deletar(Cultivo cultivo) {
        DaoManagerHiber.delete(cultivo);
    }

    @Override
    public void atualizar(Cultivo cultivo) {
        DaoManagerHiber.update(cultivo);
    }

    @Override
    public Cultivo recuperar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cultivo> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
