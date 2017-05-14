package sharafutdinov.artur.iam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by first on 14.05.17.
 */
class RunnerTest {
    @Test
    void setJ() {
        Runner runner = new Runner();
        runner.setJ(1);
        assertTrue(Integer.parseInt(runner.toString()) == 1);
    }

    @Test
    void run() {


    }

}