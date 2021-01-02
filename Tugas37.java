class Tugas37 {
   public static void main(String[] args) {
       int[] urut = {4,2,3,3,2,4,6,7,3,9};
       
        System.out.println(ujian(urut));

    }

    public static int ujian(int[] urut) {

        int xa =1, ya =1;
        for (int j = 1; j < urut.length; j++) {
            if (urut[j] > urut[j - 1]) {
                xa++;
            } else {
                xa = 1;
            }
            if (xa >=ya) {
                ya = xa;
            }
        }
        return ya;
    }
}