package link.krchis.display.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-10
 * Time : 15:20
 * Remark :
 */
@Component
public class FeignProductRemoteServiceFallbackFactory implements FallbackFactory<FeignProductRemoteService> {
    @Override
    public FeignProductRemoteService create(Throwable cause) {
        System.out.println("t =" + cause);
        return productId -> "[This product is sold out!(FallbackFactory)]";
    }
}
