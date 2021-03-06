package com.github.altrunner.collections;

import com.github.altrunner.collections.exceptions.StackEmptyException;
import com.github.altrunner.collections.exceptions.StackOverflowException;

import java.util.LinkedList;

/**
 * I can keep a number of ints in a First In Last Out fashion.
 */
public class SimpleStack implements Stack {

    int depth;

    LinkedList<Integer> stack = new LinkedList<Integer>();

    /**
     * Construct a new fixed depth stack.
     *
     * @param depth how many elements can be pushed to the created instance.
     */
    public SimpleStack(int depth) {
        this.depth = depth;
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
        if (stack.size() == depth) {
            throw new StackOverflowException();
        }
        if (stack.size() < depth) {
            stack.addFirst(number);
        }

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

        if (stack.isEmpty()) {
            throw new StackEmptyException();
        }

        return stack.removeFirst();

    }
}
