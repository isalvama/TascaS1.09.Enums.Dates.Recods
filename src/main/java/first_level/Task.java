package first_level;

public class Task {
    private String taskBody;
    private Level level;
    private boolean isDone;

    public Task (String taskBody, Level level){
        this.level = level;
        this.taskBody = taskBody;
        this.isDone = false;
    }

    public String warningString() {
        return switch (this.level) {
            case LOW -> "This is an easy task, it can be done in just a day";
            case MEDIUM -> "This task is not that easy, it might take more than a day";
            case HIGH -> "This task is quite difficult, it might take more than 5 days.";
        };
    }

    public void setLevel (Level level){
        this.level = level;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskBody='" + taskBody + '\'' +
                ", level=" + level +
                ", isDone=" + isDone +
                '}';
    }
}
