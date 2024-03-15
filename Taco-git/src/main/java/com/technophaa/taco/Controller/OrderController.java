package com.technophaa.taco.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.technophaa.taco.model.TacoOrder;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("tacoOrder")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }
    @PostMapping("/current")
    public String processOrder(TacoOrder order,  SessionStatus sessionStatus) {


        logger.info("Order Submitted: {}", order);
        sessionStatus.setComplete();

        return "redirect:/home"; // Redirect to home after successful submission
    }

}
