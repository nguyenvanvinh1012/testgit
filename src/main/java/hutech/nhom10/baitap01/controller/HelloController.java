package hutech.nhom10.baitap01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

//    @RequestMapping("/hello")
//    public String showHello(){
//        return "helloworld";
//    }
    @RequestMapping(value = {"/", "/hello"})
    public String showHello2(){
        return "helloworld";
    }
    @GetMapping("/nhapten")
    public String NhapTen(){
        return "nhapten";
    }
    @PostMapping("/nhanten")
    public String XuatTen(@RequestParam("name") String name, ModelMap modelMap){
        modelMap.addAttribute("Name", name);
        return "xuatten";
    }
}
