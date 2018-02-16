package stripe.example.service.charge;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.stripe.Stripe;
import com.stripe.model.Charge;
import ratpack.exec.Blocking;
import ratpack.exec.Promise;
import stripe.example.config.StripeConfig;

import java.util.Map;

/**
 * Service responsible for charging the card using Stripe.
 */
@Singleton
public class DefaultChargeService implements ChargeService {

    @Inject
    public DefaultChargeService(StripeConfig stripeConfig) {
        Stripe.apiKey = stripeConfig.secretKey;
    }

    @Override
    public Promise<Charge> charge(String token, Integer amount, String description) {
        return Blocking.get(() -> {
            Map<String, Object> params = Maps.newHashMap();
            params.put("amount", amount);
            params.put("currency", "usd");
            params.put("description", description);
            params.put("source", token);

            return Charge.create(params);
        });
    }
}
