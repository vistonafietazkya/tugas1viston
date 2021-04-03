import java.util.Scanner;

public class tugas{
 public static void main(String [] args){

System.out.println("ini program tugas");

 Scanner scanner = new Scanner(System.in);

	String tugas,jurusan;
	int npm;

System.out.print("Masukkan Matkul Anda: ");
tugas= scanner.nextLine(); 
System.out.print("Masukkan Jurusan Anda: ");
jurusan= scanner.nextLine();
System.out.print("Masukkan NPM Anda: ");
npm = scanner.nextInt();
System.out.println("Matkul Anda : "+tugas);
System.out.println("Jurusan Anda :"+jurusan);
System.out.println("Npm Anda :"+npm);
 }
}
