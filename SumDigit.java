public class SumDigit {
    public static  void main(String []args){
        SumDigit main = new SumDigit();
        var rec = main.SumofDigit(111);
        System.out.println(rec);
    }
    public int SumofDigit(int n){
        if (n==1||n<0){
            return  0;
        }
        return n%10+SumofDigit(n/10);
    }
}
