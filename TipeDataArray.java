public class TipeDataArray {
    public static void main(String[] args) {
        //Array adalah kumpulan dari sebuah data dengan tipe data yang sama
        //Array one dimension
        int[]kumpulanAngka =new int[3];
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 40;
        kumpulanAngka[2] = 50;
        System.out.println(kumpulanAngka[0]);

        //Array multi-dimension
        int[][] kumpulankumpulanAngkaMultiDimension =new int[3][3];
        kumpulankumpulanAngkaMultiDimension[0] = kumpulanAngka;
        System.out.println(kumpulankumpulanAngkaMultiDimension[0][2]);
    }
}
