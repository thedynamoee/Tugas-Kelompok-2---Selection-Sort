
public class SelectionSort {
    public static void main(String[] args) throws Exception {
        int nilai [] = {96,35,67,43,24,78};
        selectionSortInt(nilai);
    }

    public static void selectionSortInt(int[] bilangan) {
        //Menampilkan nilai sebelum diurutkan
        System.out.println("===Nilai sebelum diurutkan===");
        for (int b : bilangan){
            System.out.print(b + "  ");
        }

        //Logic Selection Sort (Ascending)
        for (int i = 0; i < bilangan.length; i ++){
            int indexArray = i ;
            for (int j = i; j <bilangan.length; j++){
                if(bilangan[indexArray] > bilangan[j]){
                    indexArray = j;
                }
            }

            //tukar nilai
            int hasil = bilangan[i];
            bilangan[i] = bilangan[indexArray];
            bilangan[indexArray] = hasil;
        }

        //Menampilkan nilai sesudah diurutkan
        System.out.println("\n\n===Nilai sesudah diurutkan (Ascending) ===");
        for (int b : bilangan){
            System.out.print(b + "  ");
        }

        //Logic Selection Sort (Descending)
        for (int i = 0; i < bilangan.length; i ++){
            int indexArray = i ;
            for (int j = i; j <bilangan.length; j++){
                if(bilangan[indexArray] < bilangan[j]){
                    indexArray = j;
                }
            }

            //tukar nilai
            int hasil = bilangan[i];
            bilangan[i] = bilangan[indexArray];
            bilangan[indexArray] = hasil;
        }

        //Menampilkan nilai sesudah diurutkan
        System.out.println("\n\n===Nilai sesudah diurutkan (Descending)===");
        for (int b : bilangan){
            System.out.print(b + "  ");
        }
    }
   
}
