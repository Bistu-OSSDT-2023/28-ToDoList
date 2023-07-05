package xuanke;

public class ToDo {
    private String title;
    private String description;
    private boolean completed;
    private int pre；

    public ToDo() {
        // 默认构造函数
    }

    public ToDo(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // 默认为未完成
    }

    // Getter 和 Setter 方法

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

