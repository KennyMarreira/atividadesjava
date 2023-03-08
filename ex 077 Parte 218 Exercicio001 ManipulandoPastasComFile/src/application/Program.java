package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File [] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subpasta").mkdir();
		System.out.println("Criacao de pasta: " + success);
		
		
		sc.close();
	}

}
