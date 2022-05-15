package pl.piekoszek.gorskimatches.equation;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class SolvableEquations {

    HashMap<String, String> storageOfSolvableEquations = new HashMap<String, String>();

    {

        String equation1 = "9+2=6";
        String equation2 = "6-4=3";
        String equation3 = "5+7=2";
        String equation4 = "4+6=4";
        String equation5 = "5+2=8";
        String equation6 = "1+2=8";
        String equation8 = "7-2=4";

        storageOfSolvableEquations.put(equation1, "8-2=6");
        storageOfSolvableEquations.put(equation2, "6-4=2");
        storageOfSolvableEquations.put(equation3, "9-7=2");
        storageOfSolvableEquations.put(equation4, "0+4=4");
        storageOfSolvableEquations.put(equation5, "5+3=8");
        storageOfSolvableEquations.put(equation6, "7+2=9");
        storageOfSolvableEquations.put(equation8, "7-3=4");

    }

    public String checkForCorrectAnswer(String quiz, String solution) {
        if (storageOfSolvableEquations.containsValue(solution)) {
            return storageOfSolvableEquations.get(quiz);
        }else
            return storageOfSolvableEquations.get(quiz);
    }
}

