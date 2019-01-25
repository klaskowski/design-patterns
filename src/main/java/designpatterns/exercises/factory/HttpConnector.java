package designpatterns.exercises.factory;

public class HttpConnector extends WebConnector{

    String url;

    HttpConnector(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connect as HttpConnector to " + this.url);
    }
}
