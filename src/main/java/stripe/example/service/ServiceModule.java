package stripe.example.service;

import com.google.inject.AbstractModule;
import stripe.example.service.checkout.CheckoutService;
import stripe.example.service.checkout.StripeCheckoutService;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CheckoutService.class).to(StripeCheckoutService.class);
    }
}
