package com.example.jenkinstest2;

import com.example.jenkinstest.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marco Song
 * @since 1.0.0
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String getUpper(String input){
        return StringUtil.getUpcase(input);
    }
}
