public class xnd87 {
    public static void main(String[] args) {
        int aray[] ={-9,5,21,3,25};

        int k = 5;

        int sum = 0;

        int qar = 0;

        int count =0;

        for (int i = 0; i <aray.length ; i++) {
            if (aray[i]%k==0) {
                count++;
                sum += aray[i];
            }


        }

        qar = (int) Math.sqrt(sum/count);
        System.out.println(qar);




    }
}


