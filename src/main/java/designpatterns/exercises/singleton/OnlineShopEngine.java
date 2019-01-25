package designpatterns.exercises.singleton;

public class OnlineShopEngine {

    public User registerUser(String name) {
        return new User(name);
    }

    public void signGdpr(User user) {
        user.setGdprAgreed(true);
    }

    public void makeOrder(User user) {
        if(user.isGdprAgreed()){
            Logger.INSTANCE.info("Order made for " + user.toString());
        } else {
            Logger.INSTANCE.error("User must accept GDPR before making an order.");
        }
    }
}
