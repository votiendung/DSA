package DaoNguocPhanTuStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList<E> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(E e){
        stack.addFirst(e);
    }

    public E pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }else
            return false;
    }

    public LinkedList<E> getStack() {
        return stack;
    }
}
