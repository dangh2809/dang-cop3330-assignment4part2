
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
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

    ObservableList<TodoItem> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        datePicker.setValue(LocalDate.now());
        try {
            todoList.setOnMouseClicked(event -> {
                TodoItem selectedItem = todoList.getSelectionModel().getSelectedItem();
                datePicker.setValue(LocalDate.parse(selectedItem.getDueDate()));
                description.setText(selectedItem.getDescription());
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
        //datePicker.setValue(LocalDate.parse(selectedItem.getDueDate()));
        //description.setText(selectedIndex);

    }
    @FXML
    public void DeleteButtonClicked(javafx.event.ActionEvent event){
        list.remove(todoList.getSelectionModel().getSelectedItem());
    }
    private void refresh(){
        datePicker.setValue(LocalDate.now());
        description.setText(null);

    }


}