public class xnd108 {
    public static void main(String[] args) {
        int aray[] = {255, -9, 58, 45, 100};
        int max = 0;
        max = aray[0];
        int min = aray[0];

        for (int i = 0; i < aray.length; i++) {
            if (max < aray[i]) {
                max = aray[i];
            }
            if (min > aray[i]) {
                min = aray[i];

            }
        }
        System.out.println(max+min);
    }
}
