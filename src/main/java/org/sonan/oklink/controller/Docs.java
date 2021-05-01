package org.sonan.oklink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * show restdocs.
 *
 * Created by Jaeseong on 2021/04/30
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Controller
public class Docs {

    @GetMapping("/docs")
    public String docs() {
        return "docs/index.html";
    }
}
