package designpatterns.exercises.factory;

public class WebsocketConnector extends WebConnector{

    String url;

    WebsocketConnector(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connect as WebsocketConnector to " + this.url);
    }
}
