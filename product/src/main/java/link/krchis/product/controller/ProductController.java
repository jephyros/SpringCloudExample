package link.krchis.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author InSeok <kr.chis@gmail.com>
 * Date : 2019-06-10
 * Time : 10:32
 * Remark :
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping(path = "/{productId}")
    public String getProductDetail(@PathVariable String productId){
        return "[product id =" + productId + " at" + System.currentTimeMillis() + "]";
    }
}
