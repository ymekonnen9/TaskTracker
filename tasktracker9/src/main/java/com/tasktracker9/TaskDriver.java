package com.tasktracker9;

import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;


public class TaskDriver{

  public static void main(String[] args) {
    TaskTracker taskTracker = new TaskTracker();
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] arrayInput = input.split(" ");

    taskTracker.addTask(arrayInput);
    taskTracker.listTasks(arrayInput);
  }
}