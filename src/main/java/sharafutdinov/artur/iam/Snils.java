package sharafutdinov.artur.iam;

;import java.util.Arrays;

/**
 * Created by first on 28.04.17.
 */
public class Snils {

    public boolean equalsArr(String data, String data1) {
        if(Arrays.equals(getArr(data),getArr(data1))) {
            return true;
        } else {
            return false;
        }
    }


    public int[] getArr(String data) {
        int[] dataInt = new int[data.replaceAll("\\D","").length()];
        String[] dataString = new String[data.replaceAll("\\D","").length()];
        char[] dataChar = data.replaceAll("\\D","").toCharArray();
        for (int i =0; i < data.replaceAll("\\D","").length(); ++i) {
            dataString[i] = Character.toString(dataChar[i]);
            dataInt[i] = Integer.parseInt(dataString[i]);
        }
        return dataInt;

    }
}
