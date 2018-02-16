package stripe.example.api;

import ratpack.func.Action;
import ratpack.handling.Chain;
import stripe.example.api.charge.ChargeEndpoint;
import stripe.example.api.checkout.CheckoutEndpoint;

/**
 * All endpoints exposed by the stripe-example service.
 */
public class ApiEndpoints implements Action<Chain> {

    @Override
    public void execute(Chain chain) throws Exception {

        // Display the checkout page
        chain.get("checkout", CheckoutEndpoint.class);

        // Charges the card
        chain.post("charge", ChargeEndpoint.class);
    }
}
