package link.krchis.product.api;

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

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        //throw new RuntimeException("I/O Exception");
        System.out.println("Called product id = " + productId);
        return "[product id =" + productId + " at" + System.currentTimeMillis() + "]";
    }
}
