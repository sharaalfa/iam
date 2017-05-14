package sharafutdinov.artur.iam;


import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IterCSV {
    /**
     * Логгирование
     */
    private static final Logger log = Logger.getLogger(IterCSV.class);


    /**
     * модель списка
     */
    private List<Long> list = new ArrayList<Long>();

    /**
     * создает список
     * @param csvFile на вход принимает файл csv
     * @return возвращает список
     */
    public List<Long> getList(String csvFile) {
        try {
            BufferedReader readerOfSKL = new BufferedReader(new FileReader(csvFile));
            String line = null;
            Scanner scanner = null;
            while((line = readerOfSKL.readLine())!=null){
                SnilsFromSKL snilsFromSKL = new SnilsFromSKL();
                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                while (scanner.hasNext()){
                    String data = scanner.next();


                    snilsFromSKL.setSnils((data.replaceAll("-", "")).replaceAll(" ", ""));

                }
                if (snilsFromSKL.toString() != null) {
                    list.add(Long.parseLong(((snilsFromSKL
                            .toString()))));

                }


            }


            readerOfSKL.close();


        } catch (IOException e) {
            log.trace("формат " + csvFile);
        } return list;
    }



}
