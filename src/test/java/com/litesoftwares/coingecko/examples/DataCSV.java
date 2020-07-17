import java.io.File;

public class DataCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 Chercher un fichier CSV
		
		private final static String FILE_NAME = "src/test/resources/test.csv";

		@Test
		public void testGetResource() {
		    // Param
		    final String fileName = FILE_NAME;

		    // Result
		    // ...

		    // Appel
		    final File file = CsvFileHelper.getResource(fileName);

		    // Test
		    // On sait que le fichier existe bien puisque c'est avec lui qu'on travaille depuis le début.
		    assertTrue(file.exists());
		}
		
	}

}
