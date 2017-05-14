package sharafutdinov.artur.iam;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static List<Long> list = new ArrayList<>();
    @Test
    void main() {
        list = new Result().
                getResult("/home/first/snils/38.csv", new Result()
                        .getList(318, 2));

        new WriterToDB()
                .setDB("artur", "12345", "example1", "data",
                        "snils", list, 2);
        assertNotNull(list, "ура");

    }

}