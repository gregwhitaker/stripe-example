package stripe.example.api;

import ratpack.func.Action;
import ratpack.handling.Chain;
import stripe.example.api.charge.ChargeEndpoint;
import stripe.example.api.checkout.CheckoutEndpoint;

public class ApiEndpoints implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {

        chain.get("checkout", CheckoutEndpoint.class);

        chain.post("charge", ChargeEndpoint.class);
    }
}
