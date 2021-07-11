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
