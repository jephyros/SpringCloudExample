package link.krchis.display.controller;

import link.krchis.display.service.FeignProductRemoteService;
import link.krchis.display.service.ProductRemortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-10
 * Time : 10:36
 * Remark :
 */
@RestController
@RequestMapping("/displays")
public class DisplayController {

    private final ProductRemortService productRemortService;
    private final FeignProductRemoteService feignProductRemoteService;

    public DisplayController(ProductRemortService productRemortService, FeignProductRemoteService feignProductRemoteService) {
        this.productRemortService = productRemortService;
        this.feignProductRemoteService = feignProductRemoteService;
    }

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = getProductInfo();
        return String.format("[display id = %s at %s %s]", displayId, System.currentTimeMillis(), productInfo);
    }

    private String getProductInfo(){
        //return  productRemortService.getProductInfo("P12346");
        return feignProductRemoteService.getProductInfo("P44444");
    }


}
