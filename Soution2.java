class Solution2 {

    public static void main(String[] args) {
        int[] v = new int[100];
        for (int i = 0; i < v.length; i++) {
            if (i == 0) {
                v[0] = 1;
            } else {
                int p = v[i - 1];
                int pp = 0;
                if (i == 1) {
                    pp = 0;
                } else {
                    pp = v[i - 2];
                }

                v[i] = p + pp;
            }

        }

        for (

                int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
    }

}