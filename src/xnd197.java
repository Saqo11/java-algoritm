import java.util.Locale;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class xnd197 {
    public static void main(String[] args) {
        String n = "afasf   sad asfas";
        String[] x = {};
        x = n.split("\\s+");

        for (int i = 0; i < x.length; i++) {
            String output = x[i].substring(0, 1).toUpperCase() + x[i].substring(1);
            System.out.println(output);
        }

    }
}

