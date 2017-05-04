package sharafutdinov.artur.iam;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by first on 21.04.17.
 */
public class FromXMLToValue {
    private String value;
   public String val(String path, String dir, String tag, int amount) {
       try {
           File fromXML = new File(path);
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           Document document = dBuilder.parse(fromXML);
           document.getDocumentElement().normalize();
           NodeList nodeList = document.getElementsByTagName(dir);

           Node node = nodeList.item(amount);
           Element element = (Element) node;
           value = element.getElementsByTagName(tag).item(0).getTextContent();

       } catch (Exception e) {
           e.printStackTrace();
       }
       return value;
   }
}
