package sharafutdinov.artur.iam;

/**
 * Created by first on 27.04.17.
 */
public class Digest {
    private String data;
    private String data1;
    String[] dataString = new String[data.length()];
    int[] dataInt = new int[data.length()];
    char[] dataChar = data.toCharArray();
    String[] getDataString1 = new String[data1.length()];
    int[] dataInt1 = new int[data1.length()];
    char[] dataChar1 = data1.toCharArray();

    public Digest(){

    }

    public String[] getDataString() {
        return dataString;
    }

    public void setDataString(String[] dataString) {
        this.dataString = dataString;
    }

    public int[] getDataInt() {
        return dataInt;
    }

    public void setDataInt(int[] dataInt) {
        this.dataInt = dataInt;
    }

    public char[] getDataChar() {
        return dataChar;
    }

    public void setDataChar(char[] dataChar) {
        this.dataChar = dataChar;
    }

    public String[] getDataString1() {
        return getDataString1;
    }

    public void setDataString1(String[] getDataString1) {
        this.getDataString1 = getDataString1;
    }

    public int[] getDataInt1() {
        return dataInt1;
    }

    public void setDataInt1(int[] dataInt1) {
        this.dataInt1 = dataInt1;
    }

    public char[] getDataChar1() {
        return dataChar1;
    }

    public void setDataChar1(char[] dataChar1) {
        this.dataChar1 = dataChar1;
    }

    public String getData() {
        return data;
    }

    public void setDataOfSKL(String dataOfSKL) {
        this.data = data;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }


}
