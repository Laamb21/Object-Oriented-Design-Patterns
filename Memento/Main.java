package Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.sendText("Version 1");
        System.out.println("Current text: " + editor.getText());
        caretaker.save(editor);

        editor.sendText("Version 2");
        System.out.println("Current text: " + editor.getText());
        caretaker.save(editor);

        editor.sendText("Version 3");
        System.out.println("Current text: " + editor.getText());
        caretaker.save(editor);

        caretaker.undo(editor);
        System.out.println("After first undo: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After second undo: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After third undo: " + editor.getText());

        caretaker.undo(editor); //This will show "No states to undo"
    }
}
