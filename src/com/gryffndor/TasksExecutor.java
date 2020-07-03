package com.gryffndor;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.ArrayList;
import java.util.List;

public abstract class TasksExecutor {
    private List<Task> taskList = new ArrayList<>();
    private List<Object> taskInputs = new ArrayList<>();
    private List<TaskResult> results = new ArrayList<>();

    private ExecutionType executionType;

    public TasksExecutor(ExecutionType et) {
        executionType = et;
    }

    public void addTask(Task t1, Object input2task) {
        taskList.add(t1);
        taskInputs.add(input2task);
    }

    public void addResult(TaskResult tr) {
        results.add(tr);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public List<Object> getTaskInputs() {
        return taskInputs;
    }

    public List<TaskResult> getResults() {
        return results;
    }

    protected abstract void execute();
}
