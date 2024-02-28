package utility;


	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.bouncycastle.openssl.EncryptionException;
	public class Parameterization {
	 public static String getData(String sheetname, int raw, int cell) throws EncryptionException, IOException
	 {
	  FileInputStream file1=new FileInputStream("\"\"\"C:\\Users\\Bhagyashri\\eclipse-workspace\\Vyaguta\\src\\test\\resources\\TestCases.xlsx\"\"\"");
	  String value =WorkbookFactory.create(file1).getSheet("data").getRow(raw).getCell(cell).getStringCellValue();
	  return value;
	 }
	}


