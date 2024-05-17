package com.mindhaq.demogatewayproxy

import org.springframework.cloud.gateway.mvc.ProxyExchange
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class GatewayController {

    @GetMapping("/get")
    fun handleGet(proxyExchange: ProxyExchange<ByteArray>) =
        proxyExchange.uri("https://httpbin.org/get").get()

    @PostMapping("/post")
    fun handlePost(proxyExchange: ProxyExchange<ByteArray>) =
        proxyExchange.uri("https://httpbin.org/post").post()
}
