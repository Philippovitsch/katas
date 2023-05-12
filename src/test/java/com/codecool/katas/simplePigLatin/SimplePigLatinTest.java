package com.codecool.katas.simplePigLatin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplePigLatinTest {

    SimplePigLatin simplePigLatin = new SimplePigLatin();

    @ParameterizedTest
    @CsvSource({
            "igPay atinlay siay oolcay, Pig latin is cool",
            "hisTay siay ymay tringsay, This is my string",
            "eniVay idivay icivay, Veni vidi vici",
            "arbaBay onnay acitfay hilosophumpay, Barba non facit philosophum",
            "Oay emporatay oay oresmay !, O tempora o mores !",
            "uisQay ustodietcay psosiay ustodescay ?, Quis custodiet ipsos custodes ?"
    })
    public void translateTest(String translatedSentence, String sentence) {
        assertEquals(translatedSentence, simplePigLatin.translate(sentence));
    }

}
