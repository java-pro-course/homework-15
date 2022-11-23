package com.kalamya.task23.api;


import com.kalamya.task23.service.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    private ListService listService;

    public ApiController(ListService listService){
        this.listService = listService;
    }
    @GetMapping("dividers")
 public String shareNum(
            @RequestParam("number") int num1){
        return listService.shareNumS(num1);
 }
 @GetMapping("string/{word}")
 public String NumLatter(@PathVariable String word){
     return   listService.NumLetterS(word);
 }

}

