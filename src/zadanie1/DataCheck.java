package zadanie1;

import java.util.Iterator;
import java.util.List;

public class DataCheck {
    public static boolean checkIfDataIsCorrect(List<String> data) {
        Iterator<String> iterator = data.iterator();
        while(iterator.hasNext()){
            if (iterator.next().isEmpty()){
                iterator.remove();
            }
        }
        return data.size()==1;
    }
}
