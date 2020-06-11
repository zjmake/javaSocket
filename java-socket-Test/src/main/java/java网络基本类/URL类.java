package java网络基本类;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URL类 {
    public static void main(String[] args) {


    }
    public void URL读取数据(){
        try {
            URL url = new URL("http://www.baidu.com");
            BufferedReader d
                    = new BufferedReader(new InputStreamReader(url.openStream()));
            //读取一行
            String s = d.readLine();
            d.close();
            System.out.println(s);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void URL构造方法(){

        try {
            URL url = new URL("www.baidu.com");
            new URL(url, "文件名称");
            new URL("http","www.baidu.com","文件名称");
            // 协议 地址 端口号 文件名称
            new URL("file","网址",80,"文件名称");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
