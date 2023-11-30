package Q7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnclosingClass {
    private List<Integer> data;

    public EnclosingClass() {
        data = new ArrayList<>();
        // Add sample data to the list
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
    }

    public Iterator<Integer> getEvenIterator() {
        return new EvenIterator();
    }

    private class EvenIterator implements Iterator<Integer> {
        private int index;

        public EvenIterator() {
            index = 0; // Starting from the first element (index 0)
        }

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public Integer next() {
            int current = data.get(index);
            index += 2; // Move to the next even index (skipping odd indices)
            return current;
        }
    }

    public static void main(String[] args) {
        EnclosingClass enclosingClass = new EnclosingClass();
        Iterator<Integer> evenIterator = enclosingClass.getEvenIterator();

        while (evenIterator.hasNext()) {
            System.out.println(evenIterator.next());
        }
    }
}
