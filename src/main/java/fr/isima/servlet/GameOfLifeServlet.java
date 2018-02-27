package fr.isima.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.WebServlet;

@Controller
@RequestMapping("/game")
public class GameOfLifeServlet {

    @GetMapping
    public ModelAndView gameoflife() {
        return new ModelAndView("gameoflife");
    }
}
