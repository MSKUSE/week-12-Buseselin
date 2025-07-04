public class StackLinkedList<T>

    implements Stack<T>

    StackItem top;
    @Override
    public void push(T item) {
        StackItem <T> newBox = new StackItem<T>(item);
        StackItem <T> previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop() throws MyEmptyStackExeption{
        if (top == null){
            throw MyEmptyStackExeption("stack is empty")
        }
        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

}
    public void displayStack()
    {
        if(this.top == null){
            System.out.println("This stack is empty!!! ");
        }else{
           StackItem<T> tempNode = top;
           while (tempNode != null){
               System.out.println(tempNode.getData());
               tempNode = tempNode.getNext();

           }
        }
    }

@Override
public String toString() {
    return "StackLinkedList{}";
}
