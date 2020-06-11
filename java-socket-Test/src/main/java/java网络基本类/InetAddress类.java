package java网络基本类;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress类 {

    /**
     * 网络编程获取ip地址
     * @param args
     */
    public static void main(String[] args) {

            InetAddress  myIp= null;
        try {
            //获取本地ip地址
            myIp = InetAddress.getLocalHost();
            System.out.println(myIp);
            //获取网站ip地址
            myIp = InetAddress.getByName("www.baidu.com");
            System.out.println(myIp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println(myIp);
        }
    }
}
