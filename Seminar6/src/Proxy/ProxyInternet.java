package Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private List<String> blackList = new ArrayList<>();
    private ProviderInternet provider = new ProviderInternet();

    public ProxyInternet(){
        addToBL("abc.com");
    }

    public void addToBL(String url){
        blackList.add(url);
    }

    public void removeFromBL(String url){
        blackList.remove(url);
    }

    @Override
    public void connectTo(String url) {
        if(blackList.contains(url)){
            System.out.println("Nu se poate afisa pg web");
        }else{
            provider.connectTo(url);
        }
    }
}
