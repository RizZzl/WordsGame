package wordsGame.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "words_and_hints")
@Getter
@Setter
public class WordsAndHints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String word;

    private String firstHint;

    private String secondHint;

    private String thirdHint;

    private String fourthHint;

    private String fifthHint;
}
