package stripe.example.api.checkout;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import stripe.example.config.StripeConfig;

import java.util.Map;

import static ratpack.groovy.Groovy.groovyTemplate;

public class CheckoutEndpoint implements Handler {

    @Inject
    private StripeConfig stripeConfig;

    @Override
    public void handle(Context ctx) throws Exception {
        Map<String, Object> model = Maps.newHashMap();
        model.put("price", 19.83);
        model.put("amount", 1983);
        model.put("stripeKey", stripeConfig.publishKey);

        ctx.render(groovyTemplate(model, "checkout.html"));
    }
}
