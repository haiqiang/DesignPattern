/**
 * Created by KZ on 7/13/17.
 */
public class ChicagoPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
