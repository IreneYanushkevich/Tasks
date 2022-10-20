package com.irinayanushkevich.practice.task5.interpreter_project;

public class InterpreterRunner {

    public static void main(String[] args) {

        Expression oneFromTwo = getOneOfTheLanguageExpression();
        Expression both = getBothOfLanguageExpression();

        System.out.println("He speaks at least one of the languages: " + oneFromTwo.interpret("English Russian"));
        System.out.println("She speaks both languages: " + both.interpret("English Russian"));

    }

    public static Expression getOneOfTheLanguageExpression() {
        Expression oneLanguage = new TerminalExpression("English");
        Expression twoLanguage = new TerminalExpression("Russian");
        return new OrExpression(oneLanguage, twoLanguage);
    }

    public static Expression getBothOfLanguageExpression() {
        Expression oneLanguage = new TerminalExpression("English");
        Expression twoLanguage = new TerminalExpression("Russian");
        return new AndExpression(oneLanguage, twoLanguage);
    }
}
