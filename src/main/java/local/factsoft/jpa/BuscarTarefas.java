package local.factsoft.jpa;

import local.factsoft.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class BuscarTarefas {

    public static void main(String[] args){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit-tarefas");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("select t from Tarefa as t where t.finalizado = :pFinal");
        query.setParameter("pFinal", true);

        List<Tarefa> lista = query.getResultList();
        lista.stream().forEach(System.out::println);
        lista.stream().filter(tarefa -> tarefa.getId() == 4).forEach(System.out::println);

        manager.close();
    }
}
