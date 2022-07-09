package kawalekradoslaw.calculator.glowna;

import kawalekradoslaw.calculator.KalkulatorOpcje;
import kawalekradoslaw.calculator.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Glowna
@RequiredArgsConstructor
public class Glowna {

        private final MainService mainService;

        @GetMapping("/")
        public String getHome(Model model){
            model.addAttribute("value1",0);
            model.addAttribute("value2",0);
            model.addAttribute("result",0);
            return "index";
        }
        @PostMapping("/")
        public String postHome(@ModelAttribute KalkulatorOpcje kalkulatorOpcje, Model model){
            System.out.println(kalkulatorOpcje);
            model.addAttribute("value1", kalkulatorOpcje.getValue1());
            model.addAttribute("value2", kalkulatorOpcje.getValue2());
            model.addAttribute("result",mainService.compute(kalkulatorOpcje));
            return "index";
        }

}
