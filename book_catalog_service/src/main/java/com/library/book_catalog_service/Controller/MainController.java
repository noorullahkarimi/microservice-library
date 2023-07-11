package com.library.book_catalog_service.Controller;

import com.library.book_catalog_service.Model.Catalog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public @ResponseBody
class MainController {
    @RequestMapping("/catalog")
    public List<Catalog> index(){
        List<Catalog> catalogs = new ArrayList<>();

        Catalog catalog1 = new Catalog();
        catalog1.setName("one night in dubi");
        catalog1.setDescription("about one night in dubi is");
        catalog1.setRating(100);

        Catalog catalog2 = new Catalog();
        catalog2.setName("all around the world in 80 days");
        catalog2.setDescription("about travel");
        catalog2.setRating(154);

        catalogs.add(catalog1);
        catalogs.add(catalog2);
        return catalogs;
    }
}
