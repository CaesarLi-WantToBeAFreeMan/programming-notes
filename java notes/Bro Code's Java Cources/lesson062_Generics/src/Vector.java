import java.util.ArrayList;

public class Vector <T> {
    private ArrayList<T> data = new ArrayList<>();

    public Vector(T[] array) {
        for (T i : array)
            data.add(i);
    }
    
    public int size() {
        return data.size();
    }

    public void push_back(T value) {
        data.add(value);
    }

    public void pop_back(){
        if(!data.isEmpty())
            data.remove(data.size() - 1);
    }

    public void clear() {
        data.clear();
    }

    public boolean empty() {
        return data.isEmpty();
    }

    public T front(){
    	return data.get(0);
    }

    public T back(){
    	return data.get(data.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        if(!this.empty()) {
            text.append("The size of the vector is: ").append(this.size()).append("\n");
			text.append("The front number of the vector is: ").append(this.front()).append("\n");
			text.append("The back number of the vector is: ").append(this.back());
        }else
            text = new StringBuilder("This vector is empty!!!");
        
        return text.toString();
    }
}
