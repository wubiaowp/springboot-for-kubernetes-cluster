package com.walkman.kubernetess.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kubernetes")
public class KubernetesController {

    @PostMapping("/springboot")
    public String sendRequest() {
        return "测试kubernetes部署";
    }
}
