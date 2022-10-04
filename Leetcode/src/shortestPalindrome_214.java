public class shortestPalindrome_214 {
    public static void main(String[] args) {
        shortestPalindrome_214 s = new shortestPalindrome_214();
        System.out.println(s.shortestPalindrome("abcd"));
    }

    public String shortestPalindrome(String s) {
        //方法超时
//        int n = s.length();
//        int index = 0;
//        for(int i = n;i>=0;i--){
//            if(isPalind(s.substring(0,i))) {
//                index = i;
//                break;
//            }
//        }
//        String res = new String(s);
//        for (int i = index;i<=n-1;i++){
//            res = s.charAt(i)+res;
//        }
//        return res;
        int n = s.length();
        int left = 0,right = 0,mul = 1;
        int base = 31,mod = 10007;
        int best = -1;
        for(int i = 0;i<n;i++){
            left = (int)(((long)left*base+s.charAt(i))%mod);
            right = (int)((right+(long)s.charAt(i)*mul)%mod);
            if(left == right) best = i;

            mul=(int)((long)mul*base%mod);

        }


        String add = best == n-1?"":s.substring(best+1);
        StringBuffer adds = new StringBuffer(s).reverse();
        return adds.append(add).toString();
    }


//    public Boolean isPalind(String str){
//        int n = str.length();
//        if (n == 1) return true;
//        if (n == 2) return str.charAt(0) == str.charAt(1);
//        if(n > 2) return (str.charAt(0) == str.charAt(n-1)) && isPalind(str.substring(1,n-1));
//        return false;
//    }
}
