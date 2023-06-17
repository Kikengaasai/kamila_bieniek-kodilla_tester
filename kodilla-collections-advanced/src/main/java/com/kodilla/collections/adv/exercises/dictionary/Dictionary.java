package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord (String polishWord, EnglishWord englishWord){
        //metoda getOrDefaul użyta do znalezienia na podstawie polskiego słowa listy słów angielskich
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());

        //dodajemy słowo do listy
        englishWords.add(englishWord);

        //nowy spis jest wstawiany do mapy dictionary
        dictionary.put(polishWord,englishWords);

    }

    public List<EnglishWord> findingEnglishWords (String polishWord){
        return dictionary.getOrDefault(polishWord,Collections.emptyList());
    }

    public List<EnglishWord> findingEnglishWords(String polishWord, PartOfSpeech partOfSpeech){
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())){
            if (englishWord.getPartOfSpeech().equals(partOfSpeech)){
                result.add(englishWord);
            }

        }

        return result;
    }

    public int size(){
        return dictionary.size();
    }


}
