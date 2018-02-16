package stripe.example.service.charge;

import com.stripe.model.Charge;
import ratpack.exec.Promise;

/**
 * Service responsible for charging the card.
 */
public interface ChargeService {

    /**
     * Submits a charge for the payment token.
     *
     * @param token payment token
     * @param amount charge amount
     * @param description charge description
     * @return a {@link Charge} object that details all information about the transaction
     */
    Promise<Charge> charge(String token, Integer amount, String description);
}
