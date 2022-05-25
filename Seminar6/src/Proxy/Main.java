package Proxy;

public class Main {
    public static void main(String[] args) {
        Internet conn=new ProxyInternet();
        conn = (ProxyInternet)conn;
        conn.connectTo("connec.com");
        conn.connectTo("connec2.com");

        metoda(conn,"oooop.com");
    }
    public static void metoda(Internet i, String url)
    {
        i.connectTo(url);
    }
    }

