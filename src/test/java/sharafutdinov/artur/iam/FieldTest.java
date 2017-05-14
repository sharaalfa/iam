package sharafutdinov.artur.iam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FieldTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void equalsSnils() {
        assertEquals(true, new Field().equalsSnils("1234", "1234"));
        assertEquals(true, new Field().equalsSnils("sadae", "gff"));
    }

}