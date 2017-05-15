package sharafutdinov.artur.iam;

import org.apache.ignite.IgniteException;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;


public class Runner implements Runnable {

    /**
     * Логгирование
     */
    private static final Logger log = Logger.getLogger(Runner.class);
    /**
     * лист для создания списков
     */
    private List<Long> list = new ArrayList<>();

    private int j;

    /**
     * сеттер вводимой переменной - имени файла XML
     * @param j
     */
    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return j + "";
    }

    /**
     * реализация поиска и записи совпадений
     *
     */

    public synchronized void run() {


        try{
            for (int i = 1; i < 317; i++) {
                System.out.println(i + ".XML");
                System.out.println(j + ".csv");
                list = new Result().
                        getResult("/home/first/snils/" + j + ".csv", new Result()
                                .getList(i, new Result().getIntegerList().get(i - 1)));

                new WriterToDB()
                        .setDB("artur", "12345", "example1", "data",
                                "snils", list, new Result().getIntegerList().get(i - 1));
            }
        } catch (NullPointerException e) {
            log.error("null");

        } catch (IgniteException e) {
            log.error("игнайт");

        }  catch (NumberFormatException e) {
            log.trace("другой формат " + j + ".csv");

        } catch (Exception e) {
            log.error("соединение");
        }
    }

}
