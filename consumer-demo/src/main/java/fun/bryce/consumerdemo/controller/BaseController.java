package fun.bryce.consumerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bryce
 * 2019/7/30 13:49
 */
@RestController
@RequestMapping("/demo")
public class BaseController
{
    @GetMapping
    public String get(String id)
    {
        return "收到你的id:" + id;
    }
}
