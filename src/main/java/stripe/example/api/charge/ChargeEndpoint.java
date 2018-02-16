package stripe.example.api.charge;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import ratpack.form.Form;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import stripe.example.service.charge.ChargeService;

import java.util.Map;

import static ratpack.groovy.Groovy.groovyTemplate;

/**
 * Handler responsible for charging the card.
 */
public class ChargeEndpoint implements Handler {

    @Inject
    private ChargeService chargeService;

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.parse(Form.class).then(form -> {
            String token = form.get("stripeToken");
            Integer amount = Integer.parseInt(form.get("amount"));

            chargeService.charge(token, amount, "Example Charge")
                    .then(charge -> {
                        Map<String, Object> model = Maps.newHashMap();
                        model.put("status", charge.getStatus());
                        model.put("data", charge.toJson());

                        ctx.render(groovyTemplate(model, "result.html"));
                    });
        });
    }
}
