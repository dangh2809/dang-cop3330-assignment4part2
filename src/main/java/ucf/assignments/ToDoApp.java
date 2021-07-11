
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ToDoApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var scene = new Scene(new Pane());

        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.TODOLIST);

        primaryStage.setScene(scene);
        primaryStage.setTitle("ToDo App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
