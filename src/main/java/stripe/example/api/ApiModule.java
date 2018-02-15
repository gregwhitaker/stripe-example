package stripe.example.api;

import com.google.inject.AbstractModule;
import stripe.example.api.checkout.CheckoutEndpoint;

public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ApiEndpoints.class);

        bind(CheckoutEndpoint.class);
    }
}
