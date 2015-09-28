package jax.rs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Created by Daniel on 2015-09-28.
 */
public class StreamTest {

    @Test
    public void test() {
        int x = 3;
        List<Obj> users = new ArrayList<>();
        users.add(new Obj(4));
        users.add(new Obj(5));

        Optional<Obj> f1 = users.stream().findFirst();
        assertTrue(f1.isPresent());
        f1 = users.stream().filter(o -> o.getV() == x).findFirst();
        assertTrue(f1.isPresent());
    }

    public static class Obj {
        private int v;

        public Obj(int v) {
            this.v = v;
        }

        public int getV() {
            System.out.println("GetV: " + v);
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }
    }
}
