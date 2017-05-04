package sharafutdinov.artur.iam;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by first on 26.04.17.
 */
public class IterCSV {
    public String csvValue(String csvFile) throws  IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
        String line = null;
        Scanner scanner = null;
        int index =1;
        ArrayList<SnilsFromSKL> list = new ArrayList<SnilsFromSKL>();
        while((line = bufferedReader.readLine()) != null){
            SnilsFromSKL snilsFromSKL = new SnilsFromSKL();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    snilsFromSKL.setSnils(data);
                index++;
            }
            index = 0;

            return snilsFromSKL + "";
        }
        return csvValue(csvFile);
    }

    /*public void csvValue(String csvFileOfSKL, String csvFileOf2017) throws IOException{

    }


       /* BufferedReader readerOfSKL = new BufferedReader(new FileReader(csvFileOfSKL));
        BufferedReader readerOf2017 = new BufferedReader(new FileReader(csvFileOf2017));
        String line = null;
        String line1  = null;
        Scanner scanner = null;
        Scanner scanner1 = null;
        int index = 1;
        int count = 0;
        ArrayList<SnilsFromSKL> listOfSKL = new ArrayList<SnilsFromSKL>();
        while((line = readerOfSKL.readLine())!=null && (line1 = readerOf2017.readLine())!=null){
            SnilsFromSKL snilsFromSKL = new SnilsFromSKL();
            Snils snils = new Snils();
            scanner = new Scanner(line);
            scanner1 = new Scanner(line1);
            scanner.useDelimiter(";");
            scanner1.useDelimiter(";");
            while (scanner.hasNext()){
                String data = scanner.next();
                while (scanner1.hasNext()) {
                    String data1 = scanner1.next();
                    if(snils.equalsArr(data, data1.substring(7, 21)))
                        System.out.println(data);
                    snilsFromSKL.setSnils(data);
                    //System.out.println("data " + data);
                    //System.out.println("data1 " + data1.substring(7, 21));
                    if (index == 0) {

                    }

                }



                index++;
            }
            index = 0;
            if (snilsFromSKL.toString() != null) {
                listOfSKL.add(snilsFromSKL);
                //listOf2017.add(snilsFromSKL1);
            }









            count++;
        }

        //System.out.println(listOfSKL);
       // System.out.println(listOf2017);






        readerOfSKL.close();




    }*/


   /* public String csvParser(String csvFile, String fileName, int field) throws IOException {
        Reader in = new FileReader(csvFile);
        Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        Scanner scanner = null;
        int index = 1;
        int count = 0;
        List<SnilsFromSKL> list = new ArrayList<SnilsFromSKL>();
        while((line = reader.readLine())!=null){
            SnilsFromSKL snilsFromSKL = new SnilsFromSKL();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while(scanner.hasNext()){
                String data = scanner.next();
                if(index == 0)
                    snilsFromSKL.setSnils(data);
                //else
                //System.out.println(data);
                index++;
            }
            index = 0;
            list.add(snilsFromSKL);



            count++;
        }
        reader.close();
       // System.out.println(list.get(23));
       // for(int i = 0; i < count; i++){
            //int s = Integer.parseInt(new IterCSV().csvParser("/home/first/snils_03_2017.csv", 1));
           // System.out.println(list.get(i));
        //}
        for (CSVRecord record: records){
            System.out.println(record.get(field));





                    //System.out.println(list.get(i));
                    //System.out.println(record.get(field));

                //System.out.println(list);




        } return csvParser(csvFile, fileName, 1);
        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            while((line = bufferedReader.readLine()) != null) {
                String [] snils = line.split(csvSliptBy);
                System.out.println(snils);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            if (b)
        }*/

        /*CsvReader reader = new Csv.Reader(csvFile)
                .delimiter(';').ignoreComments(true);
        //System.out.println(reader);
        while (reader.readLine()!=null)
            System.out.println(reader.readLine().toString());
        return reader.readLine() + "\n";*/
   // }


}
