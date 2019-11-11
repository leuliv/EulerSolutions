class Solution2 {

    public static void main(String[] args) {
        int count=4000000;    
        int n1=0,n2=1,n3;
        for(int i=0;i<count;++i)   {
            if (i<2) {
                v[i] = i;
            } else {
                n3=n1+n2;
                v[i] = n3;  
                n1=n2; 
                n2=n3; 
            }
        }

        int sum = 0;

        for(int i = 0;i<count;++i){
            if ((i%2)==0) {
                sum += v[i];   
            }
        }
        System.out.print(" "+sum);
    }

    public static int[] getFab(int count){
        
        return v;
    }

}