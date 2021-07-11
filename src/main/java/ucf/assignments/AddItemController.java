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
