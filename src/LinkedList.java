public class LinkedList<E> {
        private Node<E> head;
        private Node<E> tail;
        private int size;

        // Узел списка
        private static class Node<E> {
            E data;
            Node<E> next;
            Node<E> prev;

            Node(E data, Node<E> next, Node<E> prev) {
                this.data = data;
                this.next = next;
                this.prev = prev;
            }
        }

        // Добавление элемента в конец
        public void add(E element) {
            Node<E> newNode = new Node<>(element, null, tail);
            if (tail != null) {
                tail.next = newNode;
            } else {
                head = newNode;
            }
            tail = newNode;
            size++;
        }

        // Удаление элемента по индексу
        public E remove(int index) {
            if (index < 0||  index >= size) {
                throw new IndexOutOfBoundsException();
            }
            Node<E> current = getNode(index);
            E data = current.data;

            Node<E> prev = current.prev;
            Node<E> next = current.next;

            if (prev != null) {
                prev.next = next;
            } else {
                head = next;
            }

            if (next != null) {
                next.prev = prev;
            } else {
                tail = prev;
            }

            size--;
            return data;
        }

        // Получение элемента по индексу
        public E get(int index) {
            return getNode(index).data;
        }

        // Вспомогательный метод для получения узла
        private Node<E> getNode(int index) {
            if (index < 0||  index >= size) {
                throw new IndexOutOfBoundsException();
            }
            Node<E> current;
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.prev;
                }
            }
            return current;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }
}
