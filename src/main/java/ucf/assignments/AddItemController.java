
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;


import javafx.fxml.FXML;


public class AddItemController {

    @FXML
    void AddCancelButtonClicked(javafx.event.ActionEvent event) {
        ViewSwitcher.switchTo(View.TODOLIST);
    }

    @FXML
    void AddSaveButtonClicked(javafx.event.ActionEvent event) {

    }

}
