
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;


import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class EditItemController {

    @FXML
    void EditCancelButtonClicked(javafx.event.ActionEvent event) {
        ViewSwitcher.switchTo(View.TODOLIST);
    }

    @FXML
    void EditSaveButtonClicked(javafx.event.ActionEvent event) {

    }


}
