package Server;

 /*
 Common shared resource, is used by threads for writing and reading.
 */

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private final List<String> list;

    public Cache() {
        list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add("Init");
//        }
    }

    public synchronized void write(String command) {
        list.add(command);
    }

    public synchronized List<String> readAll() {
        return new ArrayList<>(list);
    }

    public synchronized boolean isEmpty() {
        return list.isEmpty();
    }

}
