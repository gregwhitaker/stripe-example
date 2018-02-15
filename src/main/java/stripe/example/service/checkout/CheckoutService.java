package stripe.example.service.checkout;

import ratpack.exec.Promise;

public interface CheckoutService {

    Promise<Boolean> processCheckout(String email, double price, String token);
}
