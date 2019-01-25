package designpatterns.exercises.factory;

public abstract class WebConnector {

    protected static WebConnector create(String url){
        if(url.contains("http:")){
            return new HttpConnector(url);
        } else if(url.contains("websocket:")) {
            return new WebsocketConnector(url);
        } else {
            throw new IllegalStateException("Unsupported protocol");
        }
    }

    public abstract void connect();
}
