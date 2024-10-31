public class MyList<T> {
    private Node head;

    public void addElement(T value){
        Node<T> node = new Node<>(value,null);
        if(head == null){
            head = node;
        }
        else{
            Node<T> Element = head;
            while (Element.next != null){
                Element = Element.next;
            }
            Element.next = node;
        }
    }

    // wyświetla wszystkie elementy listy
    public void display() {
        Node<T> node = head;
        if(node != null){
            while(node.next != null){
                System.out.print(node.value);
                node = node.next;
            }
        }
    }
    public void removeElement(){
        Node<T> node = head;
        if(node != null){
            Node<T> prev = node;
            while (node.next != null){
                prev = node;
                node = node.next;
            }
            if(prev != node){
                prev.next = null;
            }else{
                head = null;
            }
        }
    }
    public Node<T> getElement(T value){
        Node<T> node = head;
        if(node != null){
            while(node.next != null){
                if(node.value.equals(value)){
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }
}
