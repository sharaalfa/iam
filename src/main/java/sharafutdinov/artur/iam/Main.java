package sharafutdinov.artur.iam;

import org.apache.ignite.IgniteException;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    /**
     * Логгирование
     */

    private static final Logger log = Logger.getLogger(Main.class);


    /**
     * Организация 36 отдельных потоков формирования
     * списков из 36 файлов XML и перадача
     * на сравнение с со списком из сыv
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {


        for (int i = 1; i < 37; i++) {
            Runner runner = new Runner();
            runner.setJ(i);
            new Thread(runner).start();
        }








        //System.out.println(new Result().getList(1, 8243));




    }
}

