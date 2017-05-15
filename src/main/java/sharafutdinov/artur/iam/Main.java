package sharafutdinov.artur.iam;


import org.apache.log4j.Logger;
import java.sql.SQLException;


public class Main {
    /**
     * Логгирование
     */

    private static final Logger log = Logger.getLogger(Main.class);


    /**
     * Организация 37 отдельных потоков формирования
     * списков из 37 файлов XML и перадача
     * на сравнение с со списком из сsv
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {


        for (int i = 1; i < 38; i++) {
            Runner runner = new Runner();
            runner.setJ(i);
            new Thread(runner).start();
        }


    }
}

