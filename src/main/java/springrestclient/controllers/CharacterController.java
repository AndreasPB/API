package springrestclient.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;
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

    @PostMapping("/character")
    public String formPost(Model model, ServerWebExchange serverWebExchange){

        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();

        String charName = map.get("charName").get(0);

        // log.debug("Received Limit value: " + limit);
        //default if null or zero


        model.addAttribute("characters", apiService.getCharacter(charName));

        return "character";
    }
}
