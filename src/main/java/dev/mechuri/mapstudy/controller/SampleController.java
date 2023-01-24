package dev.mechuri.mapstudy.controller;

import dev.mechuri.mapstudy.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SampleController {

    @Autowired
    SampleMapper sampleMapper;

    @GetMapping("/test")
    public ResponseEntity<Object> test() {

        Map result = new HashMap<>(){{
            put("name", "다영");
            put("age", "25");
        }};

        return ResponseEntity.ok(result);
    }

    @GetMapping("/test2")
    public String test2() {
        return "test";
    }

}
