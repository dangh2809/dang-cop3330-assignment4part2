
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Hieu Dang
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {

    @Test
    void setDescription() {
        TodoItem item = new TodoItem();
        String description = "Get the blue masks";
        String expected = "Get the blue masks";
        item.setDescription(description);
        String actual = item.getDescription();
        assertEquals(expected,actual);
    }

    @Test
    void setDueDate() {
        TodoItem item = new TodoItem();
        String dueDate = "2021-07-01";
        String expected = "2021-07-01";
        item.setDueDate(dueDate);
        String actual = item.getDueDate();
        assertEquals(expected,actual);
    }

    @Test
    void setIsComplete() {
        TodoItem item = new TodoItem();
        Boolean isComplete = true;
        Boolean expected = true;
        item.setIsComplete(isComplete);
        Boolean actual = item.getIsComplete();
        assertEquals(expected,actual);
    }

    @Test
    void setTitle() {
        TodoItem item = new TodoItem();
        String title = "Cook dinner";
        String expected = "Cook dinner";
        item.setTitle(title);
        String actual = item.getTitle();
        assertEquals(expected,actual);
    }

    @Test
    void getDescription() {
        TodoItem item = new TodoItem();
        item.setDescription("Using the baking soda to clean");
        String expected = "Using the baking soda to clean";
        String actual = item.getDescription();
        assertEquals(expected,actual);
    }

    @Test
    void getDueDate() {
        TodoItem item = new TodoItem();
        item.setDueDate("2021-07-01");
        String expected = "2021-07-01";
        String actual = item.getDueDate();
        assertEquals(expected,actual);
    }

    @Test
    void getIsComplete() {
        TodoItem item = new TodoItem();
        item.setIsComplete(true);
        Boolean expected = true;
        Boolean actual = item.getIsComplete();
        assertEquals(expected,actual);
    }

    @Test
    void getTitle() {
        TodoItem item = new TodoItem();
        item.setTitle("Cook dinner");
        String expected = "Cook dinner";
        String actual = item.getTitle();
        assertEquals(expected,actual);
    }
}