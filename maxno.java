public class maxno{
    public static void main(String[] args){
        int a = 10 , b = 25 , c = 15;
        int max;

        if (a >= b && a >= c){
            max = a;
        }else if(b >= a && b >= c){
            max = b;
        }else{
            max = c;
        }
        System.out.println("Maximum number is:" + max);
    }
}
