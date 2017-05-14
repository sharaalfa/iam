package sharafutdinov.artur.iam;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by first on 13.05.17.
 */
class ResultTest {
    String openFile(String xmlFile) {
        final File file = new File(System.getProperty("user.dir")
                + File.separator + xmlFile);
        return file.getPath();
    }


    @Test
    void getList() {
        Result result = new Result();
        List<Long> poolList = new ArrayList<>();
        FromXMLToValue fromXMLToValue = new FromXMLToValue();
        String[] pool = {fromXMLToValue.val("/home/first/pfr/1.XML",
                "zl", "Snils_pfr", 0), fromXMLToValue.val("/home/first/pfr/1.XML",
                "zl", "Snils_pfr", 2)};
        //System.out.println(pool[0].toString());
        for (String s: pool) {
            //System.out.println(s);
            poolList.add(Long.parseLong(s));
        }

        //System.out.println(poolList.get(0));
        //System.out.println(result.getList(1, 3).get(0));
        assertTrue(
                Long.parseLong(result.getList(1, 3)
                        .get(0).toString()) == Long.parseLong(poolList.get(0).toString()));
       // System.out.println(result.getList(1, result.getIntegerList().get(2)));


    }

    @Test
    void getIntegerList() {
        Result result = new Result();
        assertTrue(result.getIntegerList().get(0) == 8243);

    }

    @Test
    void getResult() {
       Result result = new Result();
        Result result1 = new Result();
        assertTrue(result.getResult("/home/first/042017trud_2.csv", new IterCSV()
                .getList("/home/first/042017trud_41.csv"))
                .containsAll(result.getResult("/home/first/042017trud_2.csv", new IterCSV()
                        .getList("/home/first/042017trud_41.csv"))));
        System.out.println(result.getResult("/home/first/exa2.csv", new IterCSV()
                .getList("/home/first/exa1.csv")));



    }

}