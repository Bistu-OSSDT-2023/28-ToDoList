package xuanke;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos;

    public ToDoList() {
        todos = new ArrayList<>();
    }

    public void addTask(ToDo todo) {
        todos.add(todo);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < todos.size()) {
            ToDo todo = todos.get(index);
            todo.setCompleted(true);
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
        }
    }

    public List<ToDo> getAllTasks() {
        return todos;
    }
}
