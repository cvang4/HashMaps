/**
 * Print me my hash map exercise
 */

package HashMaps;

import java.util.HashMap;

public class ProgramMain {
    
    public static void main(String[] args) {
        Program program = new Program();
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("f.e", "for example");
        hashmap.put("etc", "and so on");
        hashmap.put("r.i.p", "rest in peace");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "p");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, "e");
    }

}
