package com.gryffndor;

public class Main {

    public static void main(String[] args) {
	    Task<Integer, Integer> multiplyBy2 = (Integer x) -> {
	        return new TaskResult(2*x);
        };

        Task<Integer, Integer> multiplyBy3 = (Integer x) -> {
            return new TaskResult(3*x);
        };

        SerialTaskExecutor taskExecutor = new SerialTaskExecutor();
        taskExecutor.addTask(multiplyBy2, 1);
        taskExecutor.addTask(multiplyBy3, 2);

        taskExecutor.execute();

        int resultCount = taskExecutor.getResults().size();
        for(int resultIdx = 0; resultIdx < resultCount; resultIdx++) {
            Integer result = taskExecutor.getResults().get(resultIdx).getResult();
            System.out.println(result);
        }
    }
}
