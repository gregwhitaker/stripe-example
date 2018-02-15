package stripe.example.service.checkout;

import com.google.inject.Singleton;
import ratpack.exec.Promise;

@Singleton
public class StripeCheckoutService implements CheckoutService {

    @Override
    public Promise<Boolean> processCheckout(String email, double price, String token) {
        return null;
    }
}
