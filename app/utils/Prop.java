package utils;


import com.google.common.base.Joiner;
import com.google.common.base.Optional;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by lijy on 16-12-7.
 */
public class Prop {
  private Map<String, Optional> properties = new HashMap<>();

  public Prop() {
  }

  public void put(String key, Object value) {
    properties.put(key, Optional.of(value));
  }

  public void put(String key) {
    properties.put(key, Optional.absent());
  }

  public void put(Prop p) {
    p.properties.entrySet().stream()
        .forEach(entry -> properties.put(entry.getKey(), entry.getValue()));
  }

  public void put(Map<String, Optional> p) {
    p.entrySet().stream()
        .forEach(entry -> properties.put(entry.getKey(), entry.getValue()));
  }

  public void put(File file) throws IOException {
    InputStream input = new BufferedInputStream(new FileInputStream(file));
    put(input);
  }

  public void put(Properties p) {
    p.entrySet().stream()
        .forEach(entry -> {
          if (entry.getValue() == null || entry.getValue().toString().isEmpty()) {
            put(entry.getKey().toString());
          } else {
            put(entry.getKey().toString(), entry.getValue());
          }
        });
  }

  public void put(InputStream input) throws IOException {
    Properties p = new Properties();
    p.load(new InputStreamReader(input, "utf-8"));
    this.put(p);
  }

  public boolean contain(String key) {
    return properties.containsKey(key);
  }

  public void remove(String key) {
    properties.remove(key);
  }

  private Optional get(String key) {
    return properties.get(key);
  }


  public Integer getInteger(String key, Integer defaultValue) {
    Optional value = get(key);
    return contain(key) && !value.equals(Optional.absent()) ? Integer.valueOf(value.get().toString()) : defaultValue;
  }

  public String getString(String key, String defaultValue) {
    Optional value = get(key);
    return contain(key) && !value.equals(Optional.absent()) ? value.get().toString() : defaultValue;
  }

  public Long getLong(String key, Long defaultValue) {
    Optional value = get(key);
    return contain(key) && !value.equals(Optional.absent()) ? Long.valueOf(value.get().toString()) : defaultValue;
  }

  public String toUrlParameter() {
    return Joiner.on('&').skipNulls()
        .join(
            properties.entrySet().stream().map(entry -> {
                  if (entry.getValue().equals(Optional.absent())) {
                    return entry.getKey();
                  } else {
                    return entry.getKey() + "=" + entry.getValue().get().toString();
                  }
                }
            ).toArray());
  }
}
