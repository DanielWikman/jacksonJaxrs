package jax.rs;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by Daniel on 2015-09-24.
 */
public class JsonObjTest {

    @Test
    public void test() throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(JsonObj.class);
        Marshaller marshaller = context.createMarshaller();
        JsonObj obj = new JsonObj();
        obj.setA("test");
        obj.setB("test");
        obj.getTheMap().put("a", "1");
        obj.getTheMap().put("b", "2");
        marshaller.marshal(obj, System.out);
    }
}
