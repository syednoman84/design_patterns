package pubsubexample;

import pubsubexample.editor.Editor;
import pubsubexample.listener.EmailNotificationListener;
import pubsubexample.listener.LogOpenListener;

public class Driver {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/Users/NomanAhmed/Documents/Noman/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}