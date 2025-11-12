package exceptionOne;

public class Stack {
    private int top;
    private int[] elements;

    public Stack() {
        this.top = -1;
        elements = new int[101];
    }

    public void push(int el) throws StackOverflow{
        if(top >= 100)
            throw new StackOverflow("Stack is full\n");
        top += 1;
        elements[top] = el;
    }

    public int pop() throws StackUnderFlow{
        if(top == -1)
            throw new StackUnderFlow("Stack is empty\n");
        top -= 1;
        return elements[top];
    }
}
