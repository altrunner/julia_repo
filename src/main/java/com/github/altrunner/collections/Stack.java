package com.github.altrunner.collections;

import com.github.altrunner.collections.exceptions.StackEmptyException;
import com.github.altrunner.collections.exceptions.StackOverflowException;

public interface Stack {
    void push(int number) throws StackOverflowException;

    int pop() throws StackEmptyException;
}
