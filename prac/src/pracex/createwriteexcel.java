package pracex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createwriteexcel extends createfolder {
	public static void excreatewriteexcel() throws IOException {
		try {
			createexcel();
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("testing masters");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("1234");
		sheet.getRow(0).createCell(1).setCellValue("abcd");
		File f = new File(path + "\\" + foldername + "\\data.xls");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		}
		catch(Exception e){
			
		}
	}

	public static void main(String[] args) throws IOException{
		excreatewriteexcel();
		
	}

}
