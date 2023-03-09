package com.example.offlinequize;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the size of int variable", "16 bit", "8 bit", "32 bit", "64 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("What is the default value of Boolean variable", "true", "false", "null", "not defined", "false", "");
        final QuestionsList question3 = new QuestionsList("Which of the following is the default value of  an instance varible ?", "Depends upon the type of variable", "null", "0", "not assigned", "Depends upon the type of variable", "");
        final QuestionsList question4 = new QuestionsList("Which is the reversed word in java programming language ?", "method", "native", "reference", "array", "native", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is not a keyword or reserver word in java ?", "if", "then", "goto", "while", "then", "");
        final QuestionsList question6 = new QuestionsList("Which is the valid declaration within an interface definiton ?", "public double method();", "public final double method();", "static void method(double d1);", "protected void methoda(double d1);", "public double methoda();", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does pPHP stands for ?", "Professional Home Page", "Hypertext Preprocessor", "Pretext Hypertext Preprocessor", "Preprocessor Home Page", "Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP ?", "Rasmus Lerdorf", "Willam Makepiece", "Drek Kolkevi", "List Barely", "Rasmus Lerdorf", "");
        final QuestionsList question3 = new QuestionsList("PHP files have default file extention as:", ".html", ".php", ".xml", ".json", ".php", "");
        final QuestionsList question4 = new QuestionsList("A PHP script should starts with ___ and end with ___:", "< php >", "<php />", "< ? ? >", "< ?php ? >", "< ?php ? >", "");
        final QuestionsList question5 = new QuestionsList("Which version of PHP introduced Try/Catch Exception?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "PHP 5", "");
        final QuestionsList question6 = new QuestionsList("If $a = 12 what will  be returned when($a ==12) ? 5 : 1 is  executed ?", "12", "1", "5", "error", "5", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("HTML stands for", "Hyper Text Markup Language", "High text mark language", "Hyper tabular markup language", "Hyper Text Language", "Hyper Text Markup Language", "");
        final QuestionsList question2 = new QuestionsList("Which of the following tag used to mark a beginning of paragraph", "<TD>", "<br>", "<p>", "<DL>", "<p>", "");
        final QuestionsList question3 = new QuestionsList("Correct HTML tag for largrst heading is :", "<head>", "<large>", "<h1>", "<heading>", ".<h1>", "");
        final QuestionsList question4 = new QuestionsList("The attribute of <form> tag", "Method", "Action", "Both (a)and(b)", "None of these", "Both (a)and(b)", "");
        final QuestionsList question5 = new QuestionsList("Markup tags tell the web browser", "How to organize the page", "How to display the page", "How to display the message box on page", "None of these", "How to display the page", "");
        final QuestionsList question6 = new QuestionsList("from which tag descriptive list starts :", "<li>", "<DO>", "<DL", "<tr>", "<li>", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }

    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Select a component which is not part of android architecture", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A_______ makes a specific set of application data available to other applications ", "Content Provider", "Broadcast Reciever", "Intent", "None of these", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are Not  a part of Android's native libraries ?", "Webkit", "Dalvik", "OpenGL", "SQLite", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an Activity life cycle, What is the  firt call back method invoked by the system ?", "onstop()", "onStart()", "onCreate()", "onRestore()", "onCreate()", "");
        final QuestionsList question5 = new QuestionsList("What activity method you use to retrive a reference  to an android view by using the id attribute of  a resource XML ?", "findViewByReference(int id);", "findViewById(int id);", "findViewById(String id);", "retriveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from content provider class is handled by method", "onCreate", "onSelect", "ContentResolver", "onClick", "ContentResolver", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }
    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch(selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
