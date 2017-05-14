package sharafutdinov.artur.iam;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


public class FromXMLToValue {

    /**
     *  Логгирование
     */
   public static final Logger log = Logger.getLogger(FromXMLToValue.class);
    /**
     * значения номера найденного снилс
     */
   private String value;
   private String value1;

    /**
     * Парсер файла XML
     * @param path путь к файлу
     * @param dir корневой элемент
     * @param tag искомый тэг
     * @param count порядковый номер снилс в XML
     * @return
     */

   public String val(String path, String dir, String tag, int count) {
       try {
           File fromXML = new File(path);
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           Document document = dBuilder.parse(fromXML);
           document.getDocumentElement().normalize();
           NodeList nodeList = document.getElementsByTagName(dir);

           Node node = nodeList.item(count);
           Element element = (Element) node;
           value = element.getElementsByTagName(tag).item(0).getTextContent();
           value1 = (value.replace("-", "")).replace(" ", "");

       } catch (NullPointerException e) {
           log.info("нет номера снилс");
       } catch (Exception e) {
           log.error("проблема чтения xml");
       }
       return value1; //value.substring(0, 3) + value.substring(4, 7) + value.substring(8, 13);
   }
}
