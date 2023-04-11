
public class HomeWork_4Task2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    - enqueue() — помещает элемент в конец очереди,
    - dequeue() — возвращает первый элемент из очереди и удаляет его,
    - first() — возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        MyStack queueMethods = new MyStack();
        for (int i = 0; i < 10; i++){
            queueMethods.enqueue(i);
            System.out.println(queueMethods.list);
        }
        System.out.println(queueMethods.dequeue());
        System.out.println(queueMethods.list);
        System.out.println(queueMethods.first());
        System.out.println(queueMethods.list);
    }
}
