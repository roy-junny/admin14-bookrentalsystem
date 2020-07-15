
package bookrental.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

//@FeignClient(name="payment", url="http://localhost:8084")
@FeignClient(name ="payment", url="${api.url.payment}")
public interface PaymentService {

    @RequestMapping(method= RequestMethod.POST, path="/payments")
    public void pay(@RequestBody Payment payment);

    @RequestMapping(method= RequestMethod.PUT, path="/payments/{rentalId}")
    public void refund(@PathVariable("rentalId") Long rentalId, @RequestBody Payment payment);
}