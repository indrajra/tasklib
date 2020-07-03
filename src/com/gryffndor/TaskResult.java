package com.gryffndor;

public class TaskResult {
    private Object result;

    public TaskResult(Object result) {
        this.result = result;
    }

    public <T extends Object> T getResult() {
        return ((T) result);
    }
}
