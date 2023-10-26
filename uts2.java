import java.util.Scanner;
public class uts2 {
public static void main(String[] args) {

    //Judul
    System.out.println("==Layar Masukkan==");
    System.out.println("Program Hitung Honor Karyawan");
    System.out.println("PT. XYZ");

    //Data
    int honorTetap = 3000000;
    
    //Operasi Input
    try (Scanner input = new Scanner (System.in)){
        System.out.print("Nama Karyawan: ");
            String nama = input.nextLine();
        System.out.print("Golongan: ");
            int gol = input.nextInt();
        System.out.print("Pendidikan (SMU/D3/S1): ");
            int kode = input.nextInt();
        System.out.print("Jumlah Jam Kerja: ");
            int jam = input.nextInt ();
        

    System.out.println("\n");
    
    //Hasil Output
    System.out.println("==Layar Keluaran==");
    System.out.println("Karyawan yang bernama: " + nama);
    System.out.println("=Honor yang diterima=");
    System.out.println("Honor Tetap:  " + honorTetap);

    //tunjangan jabatan
    if (gol==1){
       System.out.println("Tunjangan Jabatan: " + (0.05*honorTetap) );
    }else if (gol==2){
        System.out.println("Tunjangan Jabatan: " + (0.1*honorTetap) );
    }else if (gol==3){
        System.out.println("Tunjangan Jabatan: " + (0.15*honorTetap) );
    }else     
         System.out.println("Tunjangan Jabatan: " + 0 );

    //Tunjangan Pendidikan
    if (kode==1){
       System.out.println("Tunjangan Pendidikan: " + (0.025*honorTetap) );
    }else if (kode==2){
        System.out.println("Tunjangan Pendidikan: " + (0.5*honorTetap) );
    }else if (kode==3){
        System.out.println("Tunjangan Pendidikan " + (0.075*honorTetap) );
    }else     
         System.out.println("Tunjangan Pendidikan: " + 0 );

    //Honor Lembur
    if(jam > 8){
        System.out.println("Honor Lembur: " + ((jam-8)*2500));
    }else
        System.out.println(0);

    System.out.println("----------------+");
    System.out.println("Honor Total: ");
        }
    }
}
