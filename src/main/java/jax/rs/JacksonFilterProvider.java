package jax.rs;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.glassfish.jersey.message.filtering.spi.ObjectProvider;

import javax.ejb.Stateless;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by Daniel on 2015-09-28.
 */

//@Stateless
public class JacksonFilterProvider implements ObjectProvider<FilterProvider> {
    @Override
    public FilterProvider getFilteringObject(Type type, boolean b, Annotation... annotations) {

        return new FilterProvider() {

            @Override
            public BeanPropertyFilter findFilter(Object o) {
                return null;
            }

            @Override
            public PropertyFilter findPropertyFilter(Object filterId, Object valueToFilter) {
                return SimpleBeanPropertyFilter.serializeAllExcept("");
            }
        };
    }
}
