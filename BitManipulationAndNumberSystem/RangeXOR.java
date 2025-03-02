package BitManipulationAndNumberSystem;

public class RangeXOR {
    public static void main(String[] args){
        int start = 3;
        int end = 9;

        // * short-hand easy formula
        int ans = xor(end) ^ xor(start-1);

        System.out.println(ans);
    }

    // this pattern will only be there if you do it on paper after doing it on paper you will use the pattern itself.
    static int xor(int a){
        if(a%4 == 0){
            return a;
        }

        if(a%4 == 1){
            return 1;
        }

        if(a%4 == 2){
            return a+1;
        }

        return 0;
    }
}
