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
