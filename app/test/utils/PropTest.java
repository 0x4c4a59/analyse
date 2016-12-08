package test.utils;

import com.google.common.base.Optional;
import utils.Prop;

import java.io.File;
import java.io.IOException;

/**
 * Created by lijy on 16-12-6.
 */
public class PropTest {
  static public void main(String[] args) throws IOException {
    Prop p = new Prop();
    p.put("a", "sada");
    p.put("sad", 1);
    p.put(new File("conf/dota2.conf"));
    System.out.println(p.getInteger("key", 10));
  }
}
