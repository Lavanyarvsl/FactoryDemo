package qsp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Factory;

public class MySuite4 {
	 @Factory
		public Object[] runTest() throws Exception
		{
			String path="./TestSet.xlsx";
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			int rc=wb.getSheet("sheet1").getLastRowNum();
			
			Object[] allTest=new Object[rc+1];
			
			for(int i=0;i<=rc;i++)
			{
				String tn=wb.getSheet("sheet1").getRow(i).getCell(0).toString();
				Reporter.log(tn, true);
				allTest[i]=Class.forName(tn).newInstance();
			}
			
			
			return allTest;
			
			
		}
		

}
