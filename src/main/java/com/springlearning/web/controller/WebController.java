package com.springlearning.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
/*
@Target(ElementType.TYPE)
This means that annotation can be used on a class.
@Retention(RetentionPolicy.RUNTIME)
This means that annotation should be available at runtime.
@Documented
This means that this annotation should be documented in the java docs. This looks like a marker annotation.
@Component
This specifies Spring to manage the object as a bean.
*/
public class WebController {

    @RequestMapping(method = RequestMethod.GET,value = "/status")
    /*
    Specifies that the below method has answers for anything that requests for /status endpoint.
    * */
    @ResponseBody
    /*
    Specifies that the return value of the method is the response body.
    To improve these two loc, you can make use of @GetMapping("/status")
    */
    public String getStatus() {
        return "index";
    }
}
