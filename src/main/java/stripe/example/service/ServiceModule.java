package stripe.example.service;

import com.google.inject.AbstractModule;
import stripe.example.service.charge.ChargeService;
import stripe.example.service.charge.DefaultChargeService;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ChargeService.class).to(DefaultChargeService.class);
    }
}
