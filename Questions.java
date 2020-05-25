import java.util.ArrayList; //using an arraylist to add questions

public class Questions {
    private ArrayList <Question> trueFalseQuestions;
    private int current;

    public Questions(int size){
        trueFalseQuestions = new ArrayList<Question>(size);
        current = 0;
    }

    //getter for the questions class
    public Question getCurrent() {
        return trueFalseQuestions.get(current);
    }

    //methods to add a question
    public void add(Question q){ //adds a new question to the collection
        trueFalseQuestions.add(q);
    }

    public void reset(){
        current = 0;
    }

    public boolean hasNext(){
        return current < trueFalseQuestions.size();
    }

    public Question getNext(){
        if(hasNext()){
            current++;
        }
        return null;
    }
}