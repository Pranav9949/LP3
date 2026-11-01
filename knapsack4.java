public class Knapsack4 {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;
        double total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if ((double)value[i] / weight[i] <
                    (double)value[j] / weight[j]) {
                    int temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                    temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (weight[i] <= W) {
                total = total + value[i];
                W = W - weight[i];
            }
            else {
                total = total + (double)value[i] * W / weight[i];
                break;
            }
        }
        System.out.println("Maximum value = " + total);
    }
}
