package tn.esprit.devops_project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tn.esprit.devops_project.entities.Operator;


public class OperateurTest {

    private Operator operateur;

    @BeforeEach
    public void setUp() {
        operateur = new Operator();
        operateur.setIdOperateur(1L);
        operateur.setFname("nour");
        operateur.setLname("baazaoui");
        operateur.setPassword("secret");
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals(1L, operateur.getIdOperateur());
        assertEquals("nour", operateur.getFname());
        assertEquals("baazaoui", operateur.getLname());
        assertEquals("secret", operateur.getPassword());
    }
}