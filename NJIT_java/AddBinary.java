
public class AddBinary {
    public static void main(String[] args) {
        // "1010" + "1011" = "10101"
        /*
            1010  = 
            1011
            ----
           10101           
        */

        int x = Integer.parseInt("1010", 2);
        int y = Integer.parseInt("1011", 2);
        int sum = x + y;
        System.out.println(Integer.toBinaryString(sum));
    }
}
