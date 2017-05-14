package sharafutdinov.artur.iam;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static List<Long> list = new ArrayList<>();

    public static void main(String[] args) {



        for (int i = 1; i < 317; ++i){
            for (int j = 1; j < 37; ++j) {
                System.out.println(i);
                list = new Result().
                        getResult("/home/first/snils" + j + ".csv", new Result()
                                .getList(i, new Result().getIntegerList().get(i-1)));
                System.out.println(list);
                new WriterToDB()
                        .setDB("artur", "12345", "example1", "data",
                                "snils", list, new Result().getIntegerList().get(i-1));

            }
        }




    }
}

