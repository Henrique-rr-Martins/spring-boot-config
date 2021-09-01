package com.inovatec.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

//    Se a variável estiver vazia, preencherá usando o valor após os dois pontos ":"
    @Value("${ENV_DB_URL:Nenhuma}")
    private String dbEnvironmentVariable;

    @GetMapping("/") public String getAppMessage(){ return this.appMessage; }

    @GetMapping("/env-variable") public String getEnvironmentVariable(){ return "A seguinte variável de ambiente foi passada: " + this.dbEnvironmentVariable; }
}
