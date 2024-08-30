package tallerLaboratorioColecciones;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainPunto5 {
	public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Orange");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
