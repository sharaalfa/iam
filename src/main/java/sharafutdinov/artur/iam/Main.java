package sharafutdinov.artur.iam;


import java.sql.SQLException;


public class Main {

    /**
     * Многопоточная обработка данных:
     * создаются потоки списков снилс из файлов XML,
     * cоздаются потоки на совпадения со снилс из csv файлов
     * @param args
     */
    public static void main(String[] args) throws SQLException {
        /**
         * изменяя интервал, задается количество одновременно обрабытываемых XML,
         * в каждой из которых по 6 - 9 тыс. записей.
         * В данном случае идет речь о 317 файлах XML,
         * одновременная обработка которых
         * зависит от производительности ПК
         */
        for (int i = 1; i < 318; i++) {

            RunnerXML myThread = new RunnerXML();

            myThread.setNumberXML(i);
            new Thread(myThread).start();
        }



    }
}

