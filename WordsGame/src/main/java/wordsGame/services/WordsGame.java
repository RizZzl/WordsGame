package wordsGame.services;

import org.springframework.stereotype.Service;
import wordsGame.model.WordsAndHitsRepository;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Service
public class WordsGame {
    HashMap<String, String> wordsAndHints = new HashMap<>();
    WordsAndHitsRepository repository;

    public WordsGame(WordsAndHitsRepository repository) {
        this.repository = repository;
    }

    public int randomWords(HashMap<String, String> wordsAndHints) {
        //repository.ge
        return (int) (Math.random() * wordsAndHints.size());
    }

    public String setFirstHint() {
        return "Hello";
    }


}
