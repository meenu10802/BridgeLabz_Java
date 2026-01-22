package datastructure.linkedlist;

/*
8. Doubly Linked List: Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list.
*/

class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}

public class TextEditorUndoRedo {

    TextState current;

    // Add new state
    void addState(String text) {
        TextState newState = new TextState(text);

        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
    }

    // Undo
    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    // Redo
    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.undo();
        editor.display();
        editor.redo();
        editor.display();
    }
}
