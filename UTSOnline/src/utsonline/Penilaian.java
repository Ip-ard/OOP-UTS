package utsonline;
import java.util.Scanner;

public class Penilaian {

    public static void main(String[] args) {
        String nama, semester, jurusan;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Nama: ");
        nama = scanner.nextLine();
        System.out.print("Semester: ");
        semester = scanner.nextLine();
        System.out.print("Jurusan: ");
        jurusan = scanner.nextLine();
        System.out.print("Nilai OOP: ");
        int nilaioop = scanner.nextInt();
        System.out.print("Nilai Basis Data: ");
        int nilaibd = scanner.nextInt();
        System.out.print("Nilai Jaringan Komputer: ");
        int nilaiJK = scanner.nextInt();
        
        int ip, totalnilaiImk;
        totalnilaiImk = nilaioop + nilaibd + nilaiJK;
        ip = totalnilaiImk / 3;
        
        System.out.println("=================================================================================");
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Nilai OOP : " + nilaioop);
        System.out.println("Nilai Basis Data : " + nilaibd);
        System.out.println("Nilai Jaringan Komputer : " + nilaiJK);
        System.out.println("Total Nilai Mata Kuliah : " + totalnilaiImk);
        System.out.println("Indeks Prestasi : " + ip);
        
        String predikat;
        if (ip > 81 && ip < 100) {
            predikat = "A";
        }
        else if (ip > 61 && ip < 80){
            predikat = "B";
        }
        else {
            predikat = "C";
        }
            System.out.println("PREDIKAT ANDA : " + predikat);
        
        
    }
    
}
