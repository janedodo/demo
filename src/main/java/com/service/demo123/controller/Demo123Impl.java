package com.service.demo123.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-10T03:49:21.359Z")

@RestSchema(schemaId = "demo123")
@RequestMapping(path = "/demo123", produces = MediaType.APPLICATION_JSON)
public class Demo123Impl {

    @Autowired
    private Demo123Delegate userDemo123Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDemo123Delegate.helloworld(name);
    }

}
