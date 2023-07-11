package com.library.book_info_service.Controller;

import com.library.book_info_service.Model.Catalog;
import com.library.book_info_service.Model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public @ResponseBody
class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/info")
    public Catalog index(){
        List<Catalog> catalogs = Arrays.asList(restTemplate.getForObject("http://localhost:8081/catalog", Catalog[].class));
        Catalog catalog = catalogs.get(0); // get the first Catalog object from the list
        return catalog;
    }
}
