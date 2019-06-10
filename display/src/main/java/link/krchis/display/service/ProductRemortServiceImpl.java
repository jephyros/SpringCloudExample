package link.krchis.display.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-10
 * Time : 10:51
 * Remark :
 */
@Service
public class ProductRemortServiceImpl implements ProductRemortService {

    public static final String URL = "http://product/products/";

    public ProductRemortServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "getProductInfoFallback")
    public String getProductInfo(String productId) {

        return restTemplate.getForObject(URL + productId, String.class);
    }

    public String getProductInfoFallback(String productId, Throwable t) {
        System.out.println("t = " + t);
        return "[This Product is sold out]";
    }


}
