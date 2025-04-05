package src;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
	private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }
    
    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description){
        List<Task>removableTasks = new ArrayList<>();
        for(Task t : taskList) {
            if(t.getDescription().equalsIgnoreCase(description)){
                removableTasks.add(t);
            }
        }
        taskList.removeAll(removableTasks);
    }

    public int getTaskQuantity(){
        return taskList.size();
    }
    
    public void getTaskDescriptions(){
        System.out.println(taskList);
    }
    
    public String getTaskDescription(){
        return taskList.toString();
    }

}
