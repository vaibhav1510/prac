public class PPTest {

    //arr integers =1,2,3,4,5
    //val = 3
    //5-2 =3 (1)
    //4-1=3 (+1)
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};

        int[] arr = {0,4,8,12,16,20};
        int val = 4;

        int count =0;

        /**
        5-1=4
        5-2=3(+1)
        4-1=3(+1)
        4-2=2
        3-1
           **/

        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == val || arr[i] < val) {
//                break;
//            }
            if (arr[i] < val) {
                break;
            }
            Integer diff=Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                diff = arr[i] - arr[j];
                if (diff > val) {
                    continue;
                }
                if (diff == val) {
                    count++;
                }
                break;
            }
        }

        System.out.println(count);
    }
}
