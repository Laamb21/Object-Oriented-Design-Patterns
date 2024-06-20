package Memento;

import java.util.*;

//Caretaker class
public class Caretaker {
    private Stack<TextEditor.Memento> history = new Stack<>();

    public void save(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            editor.restore(history.pop());
        }
        else{
            System.out.println("No states to undo");
        }
    }
}
