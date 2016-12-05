package services;

import com.google.inject.Inject;
import play.Configuration;
import util.Prop;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by hzlijiye on 2016/12/5.
 */
public abstract class Dota2Request {
    public String get(String url, Configuration conf) {
      conf.asMap().entrySet().stream()
          .map(map -> map.getKey() )
    }
  /*public String get(String url, Configuration conf) {
    String result = "";
    BufferedReader in = null;
    String properties = prop.get().entrySet().stream()
        .filter(map -> map.getKey() != null && map.getValue() != null)
        .map(entry -> entry.getKey() + "=" + entry.getValue())
        .reduce("", (sum, item) -> sum + "&" + item);
    try {
      String urlNameString = url + "?";
      URL realUrl = new URL(urlNameString);
      // 打开和URL之间的连接
      URLConnection connection = realUrl.openConnection();
      // 设置通用的请求属性
      // 建立实际的连接
      connection.connect();
      // 定义 BufferedReader输入流来读取URL的响应
      in = new BufferedReader(new InputStreamReader(
          connection.getInputStream()));
      String line;
      while ((line = in.readLine()) != null) {
        result += line;
      }
    } catch (Exception e) {
      System.out.println("发送GET请求出现异常！" + e);
      e.printStackTrace();
    }
    // 使用finally块来关闭输入流
    finally {
      try {
        if (in != null) {
          in.close();
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    return result;
  }*/
}
