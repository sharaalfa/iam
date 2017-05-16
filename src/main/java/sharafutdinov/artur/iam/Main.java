package sharafutdinov.artur.iam;


import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Main {


    /**
     * Многопоточная обработка данных:
     * создаются потоки списков снилс из файлов XML,
     * cоздаются потоки на совпадения со снилс из csv файлов
     * @param args
     */
    public static void main(String[] args) throws SQLException {


        Runner2 runner2 = new Runner2();
        runner2.setJj(1);
        new Thread(runner2).start();
        Runner2 runner3 = new Runner2();
        runner3.setJj(2);
        new Thread(runner3).start();
        Runner2 runner4 = new Runner2();
        runner4.setJj(3);
        new Thread(runner4).start();
        Runner2 runner5 = new Runner2();
        runner5.setJj(4);
        new Thread(runner5).start();
        Runner2 runner1 = new Runner2();
        runner1.setJj(5);
        new Thread(runner1).start();
        Runner2 runner0 = new Runner2();
        runner0.setJj(6);
        new Thread(runner0).start();
        Runner2 runner6 = new Runner2();
        runner6.setJj(6);
        new Thread(runner6).start();
        Runner2 runner7 = new Runner2();
        runner7.setJj(6);
        new Thread(runner7).start();
        Runner2 runner8 = new Runner2();
        runner8.setJj(6);
        new Thread(runner8).start();
        Runner2 runner9 = new Runner2();
        runner9.setJj(6);
        new Thread(runner9).start();
        Runner2 runner10 = new Runner2();
        runner10.setJj(6);
        new Thread(runner10).start();

        for (int i = 1; i < 38; i++) {
            Runner runner = new Runner();
            runner.setResult(runner0.getListIter());
            runner.setResult(runner1.getListIter());
            runner.setResult(runner2.getListIter());
            runner.setResult(runner3.getListIter());
            runner.setResult(runner4.getListIter());
            runner.setResult(runner5.getListIter());
            runner.setResult(runner6.getListIter());
            runner.setResult(runner7.getListIter());
            runner.setResult(runner8.getListIter());
            runner.setResult(runner9.getListIter());
            runner.setResult(runner10.getListIter());
            runner.setJ(i);
            new Thread(runner).start();
        }


    }
}

