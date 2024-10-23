public class findLargest {
    public int findLargest(int a, int b, int c){
        if (a>b && a>c){
            System.out.println(a);
            return a;

        }
         else  if (b>a && b>c){
            System.out.println(b);
            return b;
        }
         else {
            System.out.println(c);
             return c;
        }


    }
}

