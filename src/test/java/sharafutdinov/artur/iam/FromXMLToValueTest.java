package sharafutdinov.artur.iam;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by first on 13.05.17.
 */
class FromXMLToValueTest{

    String openFileXML(String xmlFile) {
        final File file = new File(System.getProperty("user.dir")
        + File.separator + xmlFile);
        return file.getPath();
    }

    @Test()
    void val() {
        String s = new FromXMLToValue().val(openFileXML("test1.xml"),
                "zl", "Snils_pfr", 0);
        String s1 = new FromXMLToValue().val(openFileXML("test2.xml"),
                "zl", "Snils_pfr", 0);
        String s2 = new FromXMLToValue().val(openFileXML("test3.xml"),
                "zl", "Snils_pfr", 0);
        int count = 1;

        String s3 = "/home/first/pfr/" + count + ".XML";
        assertTrue(s3.equalsIgnoreCase("/home/first/pfr/1.XML"));
        assertTrue(s.equalsIgnoreCase("16241018020"));
        assertTrue(s1.equalsIgnoreCase(""));
        assertNull(s2);
    }


}