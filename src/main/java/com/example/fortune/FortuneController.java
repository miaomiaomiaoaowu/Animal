package com.example.fortune;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class FortuneController {
// GET：占いページを表示する（入力フォーム）
    @GetMapping("/fortune")
    public String showForm() {
        return "input";
    }

    @PostMapping("/fortune")
    public String start() {
        double fn = Math.random();
        if(fn >= 0.7){
            return "greatFortune.html";
        }else if(fn >= 0.4){
            return "middleFortune.html";
        }else if(fn >= 0.1){
            return "smallFortune.html";
        }else{
            return "misFortune.html";
        }
        
    }
}
