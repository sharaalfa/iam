package sharafutdinov.artur.iam;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IterCSVTest {
    private List<Long> list = new ArrayList<>();
    @Test
    void getList() {
        list = new IterCSV().getList(
                "/home/first/Yandex.Disk/Java_study/iam/src/main/python/sharafutdinov/artur/iam/amount.csv");


        assertTrue(list.get(0) == 8243);

    }

}