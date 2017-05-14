package sharafutdinov.artur.iam;

import org.apache.log4j.Logger;


public class Field {
    private volatile boolean aBoolean;

    /**
     * Логгирование
     */

    private  static final Logger logger = Logger.getLogger(Field.class);

    public boolean equalsSnils(String data, String data1) {

        try {
            if (data.equalsIgnoreCase(data1)) {
                aBoolean = true;
                return aBoolean;

            } else {
                aBoolean = false;
                return aBoolean;
            }

        } catch (Exception e) {
            logger.trace("проблема в " +
                    "итерации по символам");
        } return aBoolean;

    }



}
