package local.factsoft.jpa;

import local.factsoft.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveTarefa {

    public static void main(String[] args){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit-tarefas");
        EntityManager manager = factory.createEntityManager();

        Tarefa encontrada = manager.find(Tarefa.class, 5L);

        manager.getTransaction().begin();
        manager.remove(encontrada);
        manager.getTransaction().commit();
        manager.close();
    }
}
