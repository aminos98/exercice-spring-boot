package tn.rnu.eniso.gte3.tp5.exercice1;

import jakarta.persistence.EntityManager;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private static EntityManager em;

    void addMessage(Message m ){
        em.persist(m);
    }

}
