package stripe.example.api;

import ratpack.func.Action;
import ratpack.handling.Chain;
import stripe.example.api.checkout.CheckoutEndpoint;
import stripe.example.api.order.OrderEndpoint;

public class ApiEndpoints implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {

        chain.post("checkout", CheckoutEndpoint.class);

        chain.post("order", OrderEndpoint.class);
    }
}
