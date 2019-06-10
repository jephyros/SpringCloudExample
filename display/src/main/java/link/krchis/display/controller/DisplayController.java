package link.krchis.display.controller;

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

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId){
        String productInfo = "[unkonwn]";
        return String.format("[display id = %s at %s %s]",displayId,System.currentTimeMillis(),productInfo);
    }


}
