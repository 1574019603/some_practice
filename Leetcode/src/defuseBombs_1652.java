public class defuseBombs_1652 {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        defuseBombs_1652 d = new defuseBombs_1652();
        int[] r = d.decrypt(code,-2);
        System.out.println(r);
    }

    public int[] decrypt(int[] code, int k) {
        int[] copy = new int[code.length];
        if(k == 0){
            for(int i = 0;i<code.length;i++){
                copy[i] = 0;
            }
        }else if(k > 0){
            for(int i = 0;i<code.length;i++){
                copy[i] = sumPo(code,k,i);
            }
        }else {
            for(int i = 0;i<code.length;i++){
                copy[i] = sumN(code,k,i);
            }
        }

        return copy;
    }

    public int sumPo(int[] code, int k,int index){
        int sum = 0;
        for(int i = 1;i<=k;i++){
            sum += code[(index+i)%code.length];
        }
        return sum;

    }


    public int sumN(int[] code, int k,int index){
        int sum = 0;
        for(int i = k;i<=-1;i++){
            sum += code[(index+i+code.length)%code.length];
        }
        return sum;
    }

}
