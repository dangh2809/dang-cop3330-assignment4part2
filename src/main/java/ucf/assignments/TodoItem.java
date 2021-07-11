package ucf.assignments;

public class TodoItem {
    private String description;
    private String dueDate;
    private Boolean isComplete;
    private String title;

//    TodoItem(String title,String description,String dueDate,Boolean isComplete){
//        this.description = description;
//        this.dueDate = dueDate;
//        this.isComplete = isComplete;
//        this.title = title;
//    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public void setIsComplete(Boolean isComplete){
        this.isComplete = isComplete;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public String getDueDate(){
        return dueDate;
    }
    public Boolean getIsComplete(){
        return isComplete;
    }
    public String getTitle(){
        return title;
    }
}
