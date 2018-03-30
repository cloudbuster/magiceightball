package com.mikkokaraiste.magiceightball;

/**
 * Created by mikko on 30.3.2018.
 */

public class Answers {

    private String[] PositiveAnswers =
            {
                    "It is certain.",
                    "It is decidedly so.",
                    "Without a doubt.",
                    "Yes – definitely.",
                    "You may rely on it.",
                    "As I see it, yes.",
                    "Most Likely.",
                    "Outlook good.",
                    "Yes.",
                    "Signs point to yes."
            };

    private String[] NegativeAnswers =
            {
                    "Don’t count on it.",
                    "My reply is no.",
                    "My sources say no.",
                    "Outlook not so good.",
                    "Very doubtful."
            };

    private String[] NonCommittalAnswers =
            {
                    "Reply hazy.",
                    "Try again.",
                    "Ask again later.",
                    "Better not tell you now.",
                    "Cannot predict now.",
                    "Concentrate and ask again."
            };


    public String[] getPositiveAnswers() {
        return PositiveAnswers;
    }

    public String[] getNegativeAnswers() {
        return NegativeAnswers;
    }

    public String[] getNonCommittalAnswers() {
        return NonCommittalAnswers;
    }

    public String getPositiveAnswer(int answer) {
        return PositiveAnswers[answer];
    }

    public String getNegativeAnswer(int answer) {
        return NegativeAnswers[answer];
    }

    public String getNonCommittalAnswer(int answer) {
        return NonCommittalAnswers[answer];
    }
}