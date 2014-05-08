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
        return (Cultivo) DaoManagerHiber.recover("from cultivo where id =" + id).get(0);
    }

    @Override
    public List<Cultivo> recuperarTodos() {
        return (List<Cultivo>) DaoManagerHiber.recover("from Cultivo");
    }

}
