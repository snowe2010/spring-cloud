package com.tylerthrailkill.services.iam

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class Controller {
    @GetMapping("/test")
    fun test() = "hi"
}
