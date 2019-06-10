package link.krchis.display.controller;

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

    public DisplayController(ProductRemortService productRemortService) {
        this.productRemortService = productRemortService;
    }

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = productRemortService.getProductInfo("P12346");
        return String.format("[display id = %s at %s %s]", displayId, System.currentTimeMillis(), productInfo);
    }


}
