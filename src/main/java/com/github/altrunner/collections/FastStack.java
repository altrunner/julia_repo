package com.github.altrunner.collections;

import com.github.altrunner.collections.exceptions.StackEmptyException;
import com.github.altrunner.collections.exceptions.StackOverflowException;

/**
 * I can keep a number of ints in a First In Last Out fashion.
 */
public class FastStack implements Stack {

    int depth;

    int[] stack;

    int top;

    /**
     * Construct a new fixed depth stack.
     *
     * @param depth how many elements can be pushed to the created instance.
     */
    public FastStack(int depth) {
        this.depth = depth - 1;
        this.stack = new int[depth];
        top = 0;
    }

    /**
     * Add a new number to the stack.
     * Example:
     * After executing stack.push(5) on a stack containing [0, 1, 2] it will contain [5, 0, 1, 2]
     *
     * @param number to be added on top of the stack
     */
    @Override
    public void push(int number) throws StackOverflowException {
        if (top > depth) {
            throw new StackOverflowException();
        }
        stack[top] = number;
        top++;
    }

    /**
     * Get the number on top of the stack and remove it.
     * Example:
     * After executing stack.pop() on a stack containing [0, 1, 2] it will contain [1, 2]
     *
     * @return top number of the stack
     */
    @Override
    public int pop() throws StackEmptyException {
        top--;
        if (top < 0) {
            throw new StackEmptyException();
        }

        return stack[top];

    }
}
