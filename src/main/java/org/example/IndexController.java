package org.example;

import org.example.dao.UserMapper;
import org.example.entity.RankItem;
import org.example.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private RankService rankService;

    //    @RequestMapping("/")
//    public ModelAndView index() {
//        List<RankItem> rankItemList = rankService.getRank();
//        HashMap<String, Object> model = new HashMap<>();
//        model.put("rankItemList", rankItemList);
//        return new ModelAndView("index", model);
//    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println(username);
        System.out.println(password);
        return username+password;
    }

    @RequestMapping("/rankData")
    @ResponseBody
    public Object getRankData() {
        return rankService.getRank();
    }

    @RequestMapping("/test")
    public String getTest() {
        return "<html><body>123test</body></html>";
    }
}
