package com.library.book_info_service.Controller;

import com.library.book_info_service.Model.Catalog;
import com.library.book_info_service.Model.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Controller
public @ResponseBody
class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public Info index(){
        Catalog catalog = restTemplate.getForObject("http://localhost:8081/", Catalog.class);

        return arrayList;
    }
}
