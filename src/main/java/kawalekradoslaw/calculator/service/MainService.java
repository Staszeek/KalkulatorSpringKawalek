package kawalekradoslaw.calculator.service;

import org.springframework.stereotype.Service;
import kawalekradoslaw.calculator.KalkulatorOpcje;

@Service
public class MainService {

    public double compute(KalkulatorOpcje kalkulatorOpcje){
        switch(KalkulatorOpcje.getOperator()){ // podstawowe operacje na kalkulatorze
            case "+":
                return KalkulatorOpcje.getValue1() + KalkulatorOpcje.getValue2();
            case "*":
                return KalkulatorOpcje.getValue1() * KalkulatorOpcje.getValue2();
            case "/":
                return KalkulatorOpcje.getValue1() / KalkulatorOpcje.getValue2();
            case "-":
                return KalkulatorOpcje.getValue1() - KalkulatorOpcje.getValue2();
            case ".": // menu po wybraniu opcji bmi zwraca '.'
                return KalkulatorOpcje.getValue1() / (KalkulatorOpcje.getValue2()*KalkulatorOpcje.getValue2());
            default:
                return 0;
        }
    }
}
