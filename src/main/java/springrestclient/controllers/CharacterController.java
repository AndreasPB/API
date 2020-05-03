package springrestclient.controllers;

import andreas.blizzardapi.domain.gear.Gear;
import andreas.blizzardapi.domain.statistics.Statistics;
import andreas.blizzardapi.domain.summary.Character;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springrestclient.services.ApiService;

@Slf4j
@Controller
public class CharacterController {

    private ApiService apiService;

    public CharacterController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index(){
        return "index";
    }


    @GetMapping(value = "/character/{realm}/{name}")
    public ModelAndView successLogin(@PathVariable String name, @PathVariable String realm, Model model)
    {
        ModelAndView mav = new ModelAndView("character_summary");

        Character character = apiService.getCharacter(realm, name);
        Gear gear = apiService.getGear(realm, name);
//        Statistics statistics = apiService.getStatistics(realm, name);

        mav.addObject("character", character);
        mav.addObject("gear", gear);
//        mav.addObject("statistics", statistics);

        return mav;
    }

    @RequestMapping(value= "/character", method = RequestMethod.POST)
    public String Login(@ModelAttribute("character") Character character)
    {
        try
        {
            return "redirect:/character/" + character.getRealmName() + "/" + character.getName();

        } catch(Exception e)
        {
            return "redirect:/";
        }
    }

    @Controller
    public class MyErrorController implements ErrorController {

        @RequestMapping("/error")
        public String handleError() {
            //do something like logging
            return "redirect:/";
        }

        @Override
        public String getErrorPath() {
            return "/redirect:/";
        }
    }
}
