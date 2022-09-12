package org.agoncal.quarkus.microservices.number.NumberResource;

import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Instant;

@Entity
public class Publisher extends PanacheEntity {

   public String name;


   public Instant createdDate = Instant.now();

   public Publisher()
   {

   }
    public Publisher(String name) {
        this.name = name;

    }

    public void persist(Publisher publisher) {
        getEntityManager().persist(publisher);
    }
}