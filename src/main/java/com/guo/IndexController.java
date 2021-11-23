package com.guo;


import com.guo.Entity.people;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 86171
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public List<people> index(){
        Map<String, Object> map = new HashMap<>();

        List<people> peopleList = new ArrayList<>();
        peopleList.add(new people("1","1","1","1","生活不止眼前的苟且，还有诗和远方的田野","1","1","1","1"));
        map.put("data",peopleList);
        System.out.println(map);
        return peopleList;
    }
}
