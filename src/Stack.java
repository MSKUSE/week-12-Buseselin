public interface Stack < > {

    void push(T item);
    T pop() throws MyEmptyStackExeption;
    void peek();
    boolean isEmpty();


}
