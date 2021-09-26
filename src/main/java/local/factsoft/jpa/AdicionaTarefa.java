package local.factsoft.jpa;

import local.factsoft.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

public class AdicionaTarefa {

    public static void main(String[] args){

        Tarefa tarefa = Tarefa.builder()
                .descricao("Estudando Hibernate")
                .finalizado(true)
                .dataFinalizado(Calendar.getInstance())
                .build();

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit-tarefas");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(tarefa);
        manager.getTransaction().commit();
        manager.close();
    }
}
