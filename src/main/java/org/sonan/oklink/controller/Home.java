package org.sonan.oklink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * show home.
 *
 * Created by Jaeseong on 2021/04/30
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Controller
public class Home {

    @GetMapping("/home")
    public String home() {
        return "index.html";
    }
}
