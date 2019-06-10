package link.krchis.display.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-10
 * Time : 15:05
 * Remark :
 */
@FeignClient(name = "product", fallbackFactory = FeignProductRemoteServiceFallbackFactory.class)
public interface FeignProductRemoteService {
    @RequestMapping("/products/{productId}")
    String getProductInfo(@PathVariable("productId") String productId);
}
