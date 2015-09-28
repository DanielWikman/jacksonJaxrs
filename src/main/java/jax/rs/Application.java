package jax.rs;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Daniel on 2015-09-23.
 */

@ApplicationPath("/")
public class Application extends org.glassfish.jersey.server.ResourceConfig {

    public Application() {
        register(ObjectMapperProvider.class);
        packages("com.fasterxml.jackson.jaxrs.json", "jax.rs");
        register(JacksonFeature.class);
    }
//    @Override
//    public Set<Class<?>> getClasses() {
//        Set<Class<?>> classes = new HashSet<>();
//        classes.add(JacksonFeature.class);
//        classes.add(ObjectMapperProvider.class);
//        classes.add(Restf.class);
//        return classes;
//    }

}

