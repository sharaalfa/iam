package sharafutdinov.artur.iam;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;



public class Runner2 implements Runnable{


    /**
     * Логгирование
     */
    private static final Logger log = Logger.getLogger(Runner2.class);

    /**
     * создаем список для снилс из XML
     */
    private List<Long> list = new ArrayList<>();

    /**
     * для геттера
     */
    private List<Long> listIter;


    public List<Long> getListIter() {
        return listIter;
    }


    /**
     * порядковый номер XML
     */
    private int jj;


    public void setJj(int jj) {
        this.jj = jj;
    }

    @Override
    public String toString() {
        return jj + "";
    }



    @Override
    public synchronized void run() {
        try {
            System.out.println("run2 " + jj);
            Result result = new Result();

            list = result.getList(jj, result.getIntegerList().get(jj-1));
            listIter = list;


        } catch (NullPointerException e) {
            log.trace("норм");
        } catch (NumberFormatException e) {
            log.trace("тоже норм");
        }

    }
}
