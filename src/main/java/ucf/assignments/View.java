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
