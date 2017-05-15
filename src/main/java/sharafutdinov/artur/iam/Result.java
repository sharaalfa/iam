package sharafutdinov.artur.iam;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Result {
    /**
     * Логгирование
     */
    private static final Logger log = Logger.getLogger(Result.class);

    /**
     * Создание списков для сравнения
     */
    private List<Long> result;
    private List<Long> result1;
    private List<Long> list = new ArrayList<>();
    private List<Long> integerList = new ArrayList<>();
    private String value;

    /**
     * Создание списка по определенной файле XML номеров снилс,
     * порядка 5000-7000 в каждом файле
     * @param count имя файла в порядкового номерав
     * @param m количество записей в файле XML
     * @return возращает список всех снилс конкретного файла XML
     */
    public synchronized List<Long> getList(int count, long m) {

        String path = "/home/first/pfr/" + count + ".XML";

        for (int j = 0; j < m; j++) {
            value = new FromXMLToValue().val(path,
                    "zl", "Snils_pfr", j);
            if(value != null) {
                list.add(Long.parseLong(value));
            }
        }

    return list;
    }

    /**
     * Переводит в список данные о количестве записей в файлах XML
     * @return возвращает числовой список
     */
    public List<Long> getIntegerList() {
        integerList = new IterCSV().getList(
                "/home/first/Yandex.Disk/Java_study/iam/src/main/python/sharafutdinov/artur/iam/amount.csv");
        return integerList;
    }

    /**
     * Проводит сравнение двух списков на совпадение
     * @param data данные по снилс из csv файлов
     * @param list полученный список из конкретеного XML
     * @return возвращает не совпадаюшие номера в виде списка
     */

    public List<Long> getResult(String data, List<Long> list) {

        try {
            result = new IterCSV().getList(data);
            result.removeAll(list);
            result1 = new IterCSV().getList(data);
            result1.removeAll(result);
        } catch (NumberFormatException e) {
            log.error("непроверяемое исключение");
        }
        return result1;
    }
}
