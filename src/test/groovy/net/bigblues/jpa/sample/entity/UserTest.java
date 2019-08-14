package net.bigblues.jpa.sample.entity;

import eu.drus.jpa.unit.api.JpaUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.*;

@RunWith(JpaUnitRunner.class)
public class UserTest {

    @PersistenceContext(unitName = "my-test-unit")
    private EntityManager entityManager;

    @Test
    public void testSome() {
        System.out.println("UserTest.testSome");
    }
}