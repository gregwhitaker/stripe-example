package stripe.example.api.checkout;

import com.google.inject.Inject;
import ratpack.form.Form;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import stripe.example.service.checkout.CheckoutService;

public class CheckoutEndpoint implements Handler {

    @Inject
    private CheckoutService checkoutService;

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.parse(Form.class).then(form -> {
            String email = form.get("stripeEmail");
            String tokenType = form.get("stripeTokenType");
            String token = form.get("stripeToken");

            checkoutService.processCheckout(email, 9.99, token)
                    .then(success -> {
                        ctx.render("Test");
                    });
        });
    }
}
