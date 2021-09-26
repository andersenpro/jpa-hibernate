package local.factsoft.jpa;

import local.factsoft.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EditaTarefa {

    public static void main(String[] args){

        Tarefa tarefa = Tarefa.builder()
                .id(4L)
                .descricao("Estudando Hibernate 02")
                .finalizado(true)
                .dataFinalizado(null)
                .build();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit-tarefas");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.merge(tarefa);
        manager.getTransaction().commit();
        manager.close();
    }
}
