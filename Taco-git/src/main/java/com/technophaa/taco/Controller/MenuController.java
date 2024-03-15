package com.technophaa.taco.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.technophaa.taco.model.Taco;
import com.technophaa.taco.model.TacoOrder;
import com.technophaa.taco.service.IngredientService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("tacoOrder")
public class MenuController {

    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

    private final IngredientService ingredientService;

    @Autowired
    public MenuController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/menu")
    public String showMenu(Model model) {
        model.addAttribute("ingredients", ingredientService.getAllIngredients());
        return "menu";
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order() {
        return new TacoOrder();
    }

    @PostMapping("/menu")
    public String processTaco( Taco taco, @ModelAttribute TacoOrder tacoOrder) {
      
          
        

        tacoOrder.addTaco(taco);
        logger.info("Processing taco: {}", taco);

        return "redirect:/current";
    }
}
