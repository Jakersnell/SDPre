public class Objective7Lab4 {
    public static void main(String[] args) {
        int count = 1;
        int sum_total = 0;
        
        while (count <= 20) {
            sum_total += count;
            count += 1;
        }

        System.out.println(sum_total);
    }
}