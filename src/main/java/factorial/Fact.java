package factorial;

public class Fact {
    
    public int compute(int n){
        int result = -1;
        if (n ==1 || n == 0){
            result = 1;
        } else if (n==2){
            result = 2;
        }
        return result;
    }
}
