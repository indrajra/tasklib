package com.gryffndor;

@FunctionalInterface
public interface Task<TP1, P1> {
        TaskResult apply(TP1 P1) throws Exception;
}
