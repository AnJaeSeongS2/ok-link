package org.sonan.oklink.controller.archive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Request에 대응되는 url의 archive가 존재한다면, archive로 redirect시킨다.
 *
 * Created by Jaeseong on 2021/04/30
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Controller
@RequestMapping("/archive")
public class Redirect {

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/";
    }
}