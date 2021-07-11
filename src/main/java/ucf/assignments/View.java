
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

public enum View {
    TODOLIST("TodoList.fxml"),
    ADDITEM("AddItem.fxml"),
    EDITITEM("editItem.fxml");

    private String fileName;
    View(String fileName){
        this.fileName = fileName;
    }
    public String getFileName(){
        return fileName;
    }
}
