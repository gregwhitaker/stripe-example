package stripe.example.service;

import com.google.inject.AbstractModule;
import stripe.example.service.order.OrderService;
import stripe.example.service.order.InMemoryOrderService;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(OrderService.class).to(InMemoryOrderService.class);
    }
}
