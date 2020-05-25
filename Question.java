public class Question {
    //instance variables
    private String question;
    private char answer;
    boolean isWrong;

    //constructor
    Question (String question, char answer){
        this.question = question;
        this.answer = answer;
        isWrong = false;
    }

    //getters
    public String getQuestion(){
        return question;
    }
    public char getAnswer(){
        return answer;
    }

    public boolean isWrong(){
        return isWrong != true;
    }
}