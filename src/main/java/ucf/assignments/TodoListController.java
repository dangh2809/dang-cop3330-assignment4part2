
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TodoListController {
    @FXML
    public void AddItemButtonClicked(ActionEvent event) {
        ViewSwitcher.switchTo(View.ADDITEM);
    }
    @FXML
    public void EditButtonClicked(ActionEvent event) {
        ViewSwitcher.switchTo(View.EDITITEM);
    }
    @FXML
    public void CompletedButtonClicked(ActionEvent event) {
    }
    @FXML
    public void IncompleteButtonClicked(ActionEvent event) {
    }
}
