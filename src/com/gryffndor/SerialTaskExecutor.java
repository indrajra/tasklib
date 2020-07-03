package com.gryffndor;

public class SerialTaskExecutor extends TasksExecutor{

    public SerialTaskExecutor() {
        super(ExecutionType.SERIAL);
    }

    @Override
    protected void execute() {
        int nTasks = getTaskList().size();
        for(int idx = 0; idx < nTasks; idx++) {
            TaskResult taskResult;
            Object request = getTaskInputs().get(idx);
            try {
                Task task = getTaskList().get(idx);
                taskResult = task.apply(request);
            } catch (Exception e) {
                taskResult = new TaskResult(e);
            }
            addResult(taskResult);
        };
    }
}
