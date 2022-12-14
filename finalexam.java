import java.util.Scanner;

public class finalexam {
    static Scanner put = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ada berapa total loker yang tersedia? ");
        int tot = put.nextInt();
        System.out.print("Ada berapa anak yang akan menggunakan loker? ");
        int ank = put.nextInt();
        if(tot < ank){
            System.out.println("Maaf jumlah loker tidak mencukupi");
        }else{
           loker(tot, ank); 
        }
    }
    public static void loker(int mrgn, int mrgn2) {
        String[] nama = new String[mrgn2];
        String[][] lokr = new String[mrgn][5];
        int totbrg;
        //perulangan untuk memasukkan data (nama anak)//
        System.out.println();
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Siapa nama anak yang akan memakai loker ke "+(i+1)+" ? ");
            nama[i] = put.next();
        }
        System.out.println();
        //perulangan untuk memasukkan data (barang)//
        for (int i = 0; i < mrgn; i++) {
            if(i < mrgn2){
                do{
                    System.out.print("Berapa banyak barang yang akan di masukkan "+nama[i]+" kedalam loker? ");
                    totbrg = put.nextInt();
                    put.nextLine();
                    if(totbrg > 6){
                        System.out.println("Maaf barang yang akan dimasukkan melebihi kapasitas loker \n(total maksimal barang yang bisa di masukkan ke dalam loker adalah 5 barang)");
                    }
                }while(totbrg > 6);
                System.out.println("Sebutkan nama barangnya =");
                for (int j = 0; j < 5; j++) {
                    if(j < totbrg){
                        lokr[i][j] = put.nextLine();
                    }else{
                        lokr[i][j] = "<kosong>";
                    }
                }
            }else{
                for (int j = 0; j < 5; j++) {
                    lokr[i][j] = "<kosong>";
                }
            }
            System.out.println();
        }
        //perulangan untuk menampilkan data//
        for (int i = 0; i < mrgn; i++) {
            if(i < mrgn2){
                System.out.println("Loker ke "+(i+1)+" diisi oleh "+nama[i]+"\ndengan barang =");
                for (int j = 0; j < 5; j++) {
                    if(lokr[i][j] != "<kosong>"){
                        System.out.println((j+1)+". |\t"+lokr[i][j]+"\t|");
                    }else{
                        System.out.println((j+1)+".  \t"+lokr[i][j]);
                    }
                }
                System.out.println();
            }else{
                System.out.println("Loker ke "+(i+1)+" =");
                for (int j = 0; j < 5; j++) {
                    System.out.println((j+1)+".  \t"+lokr[i][j]);
                }
                System.out.println();
            }
        }
    }
}