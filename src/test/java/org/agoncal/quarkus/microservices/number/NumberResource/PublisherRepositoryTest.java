package org.agoncal.quarkus.microservices.number.NumberResource;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.common.constraint.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class PublisherRepositoryTest {



    @Test
    @TestTransaction
    public void shouldCreateAndFindAPublisher() {
        Publisher publisher = new Publisher("name");
        publisher.persist(publisher);
        assertNotNull(publisher.id);
        publisher = Publisher.findById(publisher.id);
        assertEquals("name",publisher.name);

    }

}