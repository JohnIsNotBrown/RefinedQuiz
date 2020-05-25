import java.util.*;

public class CompSciQuiz {
    static Scanner input = new Scanner(System.in);
    //This arraylist holds all of the questions and answers
    static Questions question = new Questions(10);
    static int score = 0; 
    static boolean repeat = false; //Used to repeatedly print menu until user exits
    public static void main(String [] args)
    {
        allQuestions(question);
        System.out.println("Welcome to the Computer Science Knowledge Tester");
        System.out.println("------------------------------------------------");
        System.out.println();

        //User input for name and age 
        System.out.println("Please enter your name and age (seperated by space)");
        String name = input.next();
        int age = input.nextInt();
        System.out.println("Hello " + name + ", the quiz is starting now");
        System.out.println("------------------");
        displayQuestions();
        
        //do we want the people to be in an array? or is that where the database will come in?
        Person person = new Person(name, age, score);
        System.out.println(person);

        //Calls method to display menu 
        while(!repeat)
        {
            displayMenu(); 
        }
        
    }

    //Displays menu of options
    public static void displayMenu()
    {
        System.out.println("Main Menu");
        System.out.println("---------");
        System.out.println("1 - View Quiz Results");
        System.out.println("2 - View Top 5 Scores");
        System.out.println("3 - View a Persons Score");
        System.out.println("4 - Exit Quiz");
        System.out.println();

        System.out.println("Please select an option");
        int option = input.nextInt(); //Start of switch case that allows user to select from menu
        int selection = option;
        if(selection != 4)
        {
            switch(selection)
            {
                case 1: 
                    wrongAnswers();
                    break;
                case 2:

                    break;
                case 3: 

                    break;
                default:
                    System.out.println("Wrong input, try again");
            }
        }
        else if(option == 4)
        {
            System.out.println("Thanks for taking the quiz, goodbye!");
            repeat = true; 
        }
    }

    //Method that contains questions
    public static void allQuestions(Questions question)
    {
        question.add(new Question("The sky is blue", 'T'));
        question.add(new Question("Youngboy is great", 'T'));
        question.add(new Question("There are two types of loops in java", 'T'));
        question.add(new Question("Java is object oriented", 'F'));
        question.add(new Question("Nigerian jollof rice is terrible", 'T'));
    }

    //static ArrayList <char> personalAnswers;
    //Method that loops through questions
    public static void displayQuestions()
    {
        while(question.hasNext())
        {
            Question current = question.getCurrent(); //viewing the current question class
            System.out.println(current.getQuestion());
            char ans = input.next().charAt(0); //user input to get answer to question
            if(ans == current.getAnswer())
            {
                score += 1;
            }
            else
            {
                current.isWrong = true;
            }
            question.getNext();
        }
        question.reset();
    }
    
    //Method that holds wrong answers 
    public static void wrongAnswers()
    {
        System.out.println("------------------------------------------------------");
        System.out.println("With a grade of " + score + "/5");
        System.out.println("These are the questions you got wrong: ");
        System.out.println();
        while(question.hasNext())
        {
            Question current = question.getCurrent();
            if(current.isWrong){
                System.out.println(current.getQuestion());
            }
            question.getNext();
        }
        question.reset();
        System.out.println("------------------------------------------------------");
    }
}