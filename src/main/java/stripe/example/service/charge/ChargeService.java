package stripe.example.service.charge;

import com.stripe.model.Charge;
import ratpack.exec.Promise;

public interface ChargeService {

    Promise<Charge> charge(String token, Integer amount, String description);
}
