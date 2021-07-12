
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class TodoListController implements Initializable {

    @FXML
    ListView<TodoItem> todoList;

    @FXML
    TextArea description;

    @FXML
    DatePicker datePicker;

    @FXML
    Button addItemButton;
    @FXML
    CheckBox isComplete;
    @FXML

    FileChooser fileChooser = new FileChooser();

    ObservableList<TodoItem> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        datePicker.setValue(LocalDate.now());
        fileChooser.setInitialDirectory(new File("src/main/resources"));
        try {
            todoList.setOnMouseClicked(event -> {
                TodoItem selectedItem = todoList.getSelectionModel().getSelectedItem();
                datePicker.setValue(LocalDate.parse(selectedItem.getDueDate()));
                description.setText(selectedItem.getDescription());
                isComplete.setSelected(selectedItem.getIsComplete());
            });
        } catch(Exception e){
            System.out.print("Selection Error");
        }
    }
    @FXML
    public void AddItemButtonClicked(javafx.event.ActionEvent event) {
        String itemDescription = description.getText();
        try {
            String itemDueDate = datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Boolean itemIsComplete = isComplete.isSelected();
            todoList.setItems(list);
            refresh();
            list.add(new TodoItem(itemDescription,itemDueDate,itemIsComplete));
        } catch(IllegalArgumentException e){
            System.out.println("Date format insert incorrect");
        }



    }

    @FXML
    public void UpdateButtonClicked(javafx.event.ActionEvent event){
        int selectedIndex = todoList.getSelectionModel().getSelectedIndex();
        list.remove(todoList.getSelectionModel().getSelectedItem());

        String itemDescription = description.getText();
        String itemDueDate = datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Boolean itemIsComplete = isComplete.isSelected();
        todoList.setItems(list);
        refresh();
        list.add(selectedIndex,new TodoItem(itemDescription,itemDueDate,itemIsComplete));


    }
    @FXML
    public void DeleteButtonClicked(javafx.event.ActionEvent event){
        list.remove(todoList.getSelectionModel().getSelectedItem());
    }
    private void refresh(){
        datePicker.setValue(LocalDate.now());
        description.setText(null);
        isComplete.setSelected(false);
    }

    @FXML
    public void SaveButtonClicked(javafx.event.ActionEvent event) {
        Window stage = todoList.getScene().getWindow();
        fileChooser.setTitle("Save Dialog");
        fileChooser.setInitialFileName("mysave");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"), new FileChooser.ExtensionFilter("pdf","*.pdf"));
        try {
            File file = fileChooser.showSaveDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
        } catch(Exception e){

        }
    }
    @FXML
    public void LoadButtonClicked(javafx.event.ActionEvent event) {
        Window stage = todoList.getScene().getWindow();
        fileChooser.setTitle("Save Dialog");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt","*.docx","*.doc"), new FileChooser.ExtensionFilter("images","*.pdf","*.gif","*.png"));
        try {
            File file = fileChooser.showOpenDialog(stage);
            fileChooser.setInitialDirectory(file.getParentFile());
        } catch(Exception e){

        }
    }
}