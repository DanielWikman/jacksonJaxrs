package jax.rs;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daniel on 2015-09-23.
 */
@XmlRootElement
public class JsonObj {
    private String a;
    private String b;
    private Map<String,String> theMap;
    @XmlTransient
    private String c;

    public JsonObj() {
        theMap = new HashMap<String, String>();
        for (StackTraceElement ste: Thread.currentThread().getStackTrace()) {
            if (ste.getClassName().toLowerCase().contains("moxy")) {
                c = ste.getClassName();
                return;
            }
            if (ste.getClassName().toLowerCase().contains("jackson")) {
                c = ste.getClassName();
                return;
            }
        }
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @XmlTransient
    public String getC() {
        return c;
    }

    public Map<String, String> getTheMap() {
        return theMap;
    }

    public void setTheMap(Map<String, String> theMap) {
        this.theMap = theMap;
    }
}
