package Repositorio.implementacoes;

import Negocio.Agricultor;
import DaoHibernate.DaoManagerHiber;
import Repositorio.interfaces.RepositorioInterfaceAgricultor;

public class RepositorioImplementacaoAgricultorDB implements RepositorioInterfaceAgricultor {

    @Override
    public Agricultor recuperar(Long id) {
        return (Agricultor) DaoManagerHiber.recover("from agricultor where id =" + id ).get(0);
    }

    @Override
    public void adicionar(Agricultor agricultor) {
        DaoManagerHiber.persist(agricultor);
    }

    @Override
    public void deletar(Agricultor agricultor) {
        DaoManagerHiber.delete(agricultor);
    }

    @Override
    public void atualizar(Agricultor agricultor) {
        DaoManagerHiber.update(agricultor);
    }

}
