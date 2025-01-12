package com.tasktracker9;
import java.util.ArrayList;
import java.util.Date;

public class TaskTracker {
  private ArrayList<Task> tasks = new ArrayList<>();


  public void addTask(String[] arrayInput){
    if(arrayInput[0].equals("add")){
      Task addTask = new Task(tasks.size() + 1,arrayInput[1], "todo");
      tasks.add(addTask);
    }
  }

  public void updateDescription(String[] arrayInput){
    if(arrayInput[0].toLowerCase().equals("update")){
      tasks.get(Integer.parseInt(arrayInput[1])).setDescription(arrayInput[2]);
      tasks.get(Integer.parseInt(arrayInput[1])).setUpdatedAt(new Date().getTime());
    }
  }

  public void updateStatus(String[] arrayInput){
    if(arrayInput[0].toLowerCase().contains("mark")){
      tasks.get(Integer.parseInt(arrayInput[1])).setStatus(arrayInput[0].substring(4));
      tasks.get(Integer.parseInt(arrayInput[1])).setUpdatedAt(new Date().getTime());
    }
  }

  public void deleteTask(String[] arrayInput){
    if(arrayInput[0].toLowerCase().equals("delete")){
      tasks.remove(Integer.parseInt(arrayInput[1]));
    }
  }

  public void listTasks(String[] arrayInput){
    if(String.join(" ", arrayInput).toLowerCase().equals("list")){
      System.out.println(tasks);
    }
  }

  public void listDoneTasks(String[] arrayInput){
    if(String.join(" ", arrayInput).equals("list done")){
      for (Task task: tasks) {
        if(task.getStatus().equals("done")){
          System.out.println(task);
        }
      }
    }
  }

  public void listInProgressTasks(String[] arrayInput){
    if(String.join(" ", arrayInput).toLowerCase().equals("list in-progress")){
      for (Task task: tasks) {
        if(task.getStatus().equals("in-progress")){
          System.out.println(task);
        }
      }
    }
  }

}


