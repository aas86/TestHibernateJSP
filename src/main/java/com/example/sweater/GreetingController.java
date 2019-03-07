package com.example.sweater;

import com.example.sweater.domain.City;
import com.example.sweater.repos.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {

   /* @Autowired
    private MessageRepo messageRepo;*/
   @Autowired
   private CityRepo cityRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Map<String, Object> model) {
        // Модель это то, куда мы будем складывать данные, которые хотим вернуть пользователю
        model.put("name", name);

        //return "greeting"; // возвращаем то, что хотим отобразить (здесь это файл greetings.html)
        return "index";
    }

    @GetMapping
    //public String index(Map<String, Object> model){
    public String index(Model model){
        Iterable<City> city = cityRepo.findAll();
        model.addAttribute("city", city);
        return "index";
    }

  /*  @GetMapping
    public String index(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "index";
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag);
        messageRepo.save(message);
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "index";
    }*/


}