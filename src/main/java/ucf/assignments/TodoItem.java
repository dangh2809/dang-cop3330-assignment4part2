

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

public class TodoItem {
    private String description;
    private String dueDate;
    private Boolean isComplete;

    TodoItem(String description,String dueDate,Boolean isComplete){
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = isComplete;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public void setIsComplete(Boolean isComplete){
        this.isComplete = isComplete;
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
    public String toString(){
        String outputStr="";
        outputStr += (this.description + " at " +this.dueDate+ " . ");
        if(this.isComplete){
            outputStr += "Completed.";
        } else {
            outputStr+= "Incompleted.";
        }
        return outputStr;
    }

}
