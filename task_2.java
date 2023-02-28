import java.util.HashMap;
import java.util.Map;



public class task_2 {
    public static void main(String[] args) {
        String[] nameWorkers = {"Иван", "Вася", "Петя", "Сергей", "Григорий", "Григорий",
                "Петя", "Алла", "Антон", "Иван", "Ольга", "Иван", "Сергей", "Григорий", "Иван"};

        HashMap<String, Integer> workers = new HashMap<>();
        for (String i : nameWorkers) {
            int newValue = workers.getOrDefault(i, 0) + 1;
            workers.put(i, newValue);
        }
        System.out.println(workers);

        
        Map<String, Integer> sortedName = new HashMap<>();
        int max = 1;
        for (int value : workers.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : workers.entrySet()) {
                String key = entry.getKey();
                if (workers.get(key) == i) {                    
                    System.out.format("%s %d \n", key, workers.get(key));

                }
            }
        }


    }


}