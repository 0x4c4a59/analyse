package services;

import utils.Prop;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by lijy on 2016/12/5.
 */
public interface Dota2Request {

  String get(Prop prop) throws IOException;

}
