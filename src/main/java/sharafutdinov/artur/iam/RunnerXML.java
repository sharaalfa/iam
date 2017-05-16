package sharafutdinov.artur.iam;

import java.util.ArrayList;
import java.util.List;


public class RunnerXML implements Runnable {
    /**
     *  Число потоков одновременной обработки XML
     */
    private int numberXML;

    /**
     * макет создания списка снилс из файла XML
     */

    private List<Long> list = new ArrayList<>();

    /**
     * сеттер для задания числа одновременной обработки файлов XML
     * @param numberXML
     */

    public void setNumberXML(int numberXML) {
        this.numberXML = numberXML;
    }

    @Override
    public void run() {
        Result result = new Result();

        list = result.getList(numberXML, result.getIntegerList().get(numberXML - 1));
        for (int j = 1; j < 38; j++) {

            Runner runner = new Runner();
            runner.setResult(list);
            runner.setJ(j);
            new Thread(runner).start();
        }
    }




}
