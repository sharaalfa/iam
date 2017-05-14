package sharafutdinov.artur.iam;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IterCSV {

    private List<Long> list = new ArrayList<Long>();

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
            e.printStackTrace();
        } return list;
    }



}
