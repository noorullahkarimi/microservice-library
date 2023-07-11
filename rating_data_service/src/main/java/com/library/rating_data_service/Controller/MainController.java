package com.library.rating_data_service.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public @ResponseBody
class MainController {
    @RequestMapping("/")
    public ArrayList index(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("travel to eroup");
        arrayList.add("one day life");
        return arrayList;
    }
}
