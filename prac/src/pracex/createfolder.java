package pracex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class createfolder {
	static String foldername = "testdata";
	static String folderpath="\\" + foldername + "\\data.xls";
    static String path= System.getProperty("user.dir");;
	public static void createfolderex() {
		File f = new File(foldername);
		if (!(f.exists())) {
			f.mkdir();
			System.out.println("folder created");
		} else {
			System.out.println("folder already exists");
		}
	}

	public static void createexcel() throws IOException{
		try {
			createfolderex();
			System.out.println(path);
			File f = new File(path + "\\" + foldername + "\\data.xlsx");
			FileOutputStream fo = new FileOutputStream(f);
			System.out.println("excel created");
		} catch (Exception e) {
			System.out.println("excel not created");
		}
	}

	public static void main(String[] args) throws IOException {
		
		createexcel();
	}

}
