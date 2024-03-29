package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord(){

        //dostarczamy dane
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");


        //wywołanie metody testującej
        dictionary.addWord(polishWord,englishWord);

        //sprawdzanko
        assertEquals(1, dictionary.size());

    }

    @Test
    public void testFindingEnglishWords(){

        //dajemy rzeczy potrzebne
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack" ));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.VERB, "play" ));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game" ));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play" ));

        //po dostarczeniu danych uruchamiamy metodę
        List<EnglishWord> result = dictionary.findingEnglishWords("gra");

        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.VERB, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));

        assertEquals(expectedList,result);
    }

    @Test
    public void testFindingEnglishWords_withPartOfSpeech(){

        //dane

        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack" ));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood" ));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take" ));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play" ));

        // wywołujemy odpowiednią metode

        List<EnglishWord> result = dictionary.findingEnglishWords("brać",PartOfSpeech.NOUN);

        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));

        assertEquals(expectedList, result);


    }

}