package com.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);

	public static void ConvertExcelToSheet(String excellFilePath) throws IOException {

		FileInputStream fileStream = new FileInputStream(excellFilePath);
		Workbook book = WorkbookFactory.create(fileStream);
		XSSFSheet sheet = (XSSFSheet) book.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();
		Map<Double, SourceClass> map = new HashMap<>();

		for (Row row : sheet) {
			for (Cell cell : row) {
				System.out.print(cell + "|" + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------");
		List<SourceClass> list = new ArrayList<>();
		Iterator<Row> rowiterator = sheet.iterator();
		SourceClass source = new SourceClass();
		while (rowiterator.hasNext()) {
			Row nextRow = rowiterator.next();
			Iterator<Cell> ce = nextRow.cellIterator();
			while (ce.hasNext()) {
				
				source.setId(ce.next().getNumericCellValue());
				source.setName(ce.next().getStringCellValue());
				source.setGender(ce.next().getStringCellValue());
				source.setSalary(ce.next().getNumericCellValue());
				source.setDate(ce.next().getStringCellValue());
			}
		}
		list.add(source);
		for(SourceClass c:list) {
			System.out.println(c.getName());
		}

	}

	public static void main(String[] args) throws IOException {

		Main.ConvertExcelToSheet("C:\\Users\\Ravi\\Downloads\\SourceFile.xlsx");

	}

}
