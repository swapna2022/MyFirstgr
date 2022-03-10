package csv;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class CsvFileProgAssessment {

	private String getRandomName(int n) {
		// chose a Character random from this String
		String randomName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (randomName.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(randomName.charAt(index));
		}

		return sb.toString();
	}

	public String getRandomMarks() {

		// initializing min and max values
		int min = 0, max = 100;

		// setting the range between min & max
		int range = max - min + 1;

		// generating random number using java.lang.Math.random() which is a static
		// method and returns a double value. so, type casted to int.
		int randomNum = (int) (Math.random() * range) + min;

		return String.valueOf(randomNum);
	}

	public List<String[]> generateStudentRecords(int noOfrecords) {
		// create a List which contains String array
		List<String[]> records = new ArrayList<String[]>();

		String[] newRecord = null;
		for (int index = 0; index <= noOfrecords; index++) {
			if (index == 0) {
				newRecord = new String[] { "FirstName", "LastName", "Subject1", "Subject2", "Subject3", "Subject4",
						"Subject5" };
			} else {
				newRecord = new String[] { getRandomName(10), getRandomName(5), getRandomMarks(), getRandomMarks(),
						getRandomMarks(), getRandomMarks(), getRandomMarks() };
			}

			records.add(index, newRecord);
		}

		return records;
	}

	public List<String[]> updateStudentRecordsWithAverageMarks(List<String[]> records) {

		List<String[]> updatedRecords = new ArrayList<String[]>();
		String[] updatedRecord = null;
		for (int index = 0; index < records.size(); index++) {
			String[] record = records.get(index);

			// update the header with average marks which is on 0 index
			if (index == 0) {
				updatedRecord = new String[] { record[0], record[1], record[2], record[3], record[4], record[5],
						record[6], "AverageMarks" };

			} else {
				// update all sub marks by parsing String to Integer with average marks starting
				// from index 1
				int subject1 = Integer.parseInt(record[2]);
				int subject2 = Integer.parseInt(record[3]);
				int subject3 = Integer.parseInt(record[4]);
				int subject4 = Integer.parseInt(record[5]);
				int subject5 = Integer.parseInt(record[6]);

				int averageMarks = Math.round((subject1 + subject2 + subject3 + subject4 + subject5) / 5);

				updatedRecord = new String[] { record[0], record[1], record[2], record[3], record[4], record[5],
						record[6], String.valueOf(averageMarks) };
			}

			updatedRecords.add(index, updatedRecord);
		}

		return updatedRecords;
	}

	public boolean writeRecordsToCSV(String filePath, List<String[]> records) {

		boolean isSuccess = false;

		try {

			// Instantiating csv writer class
			CSVWriter csvWriter = new CSVWriter(new FileWriter("CSVData//studentRecords.csv"));

			// write all records at once
			csvWriter.writeAll(records);

			// close writers
			csvWriter.close();

			isSuccess = true;

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return isSuccess;
	}

	public List<String[]> readRecordsFromCSV(String filePath) {

		List<String[]> records = new ArrayList<String[]>();

		try {

			// create csv reader
			CSVReader csvReader = new CSVReader(new FileReader("CSVData//studentRecords.csv"));

			// read all records at once
			records = csvReader.readAll();

			// close readers
			csvReader.close();

		} catch (IOException | CsvException ex) {
			ex.printStackTrace();
		}

		return records;
	}

	@Test(enabled = true)
	public void testToCreateCSVFileWithStudentInformation() {
		String filePath = "C:\\Javaselenium\\eclipse-workspace\\utilPractice\\CSVData//studentRecords.csv";

		List<String[]> records = generateStudentRecords(2000);
		Assert.assertNotNull(records);
		Assert.assertTrue(records.size() == 2001, "Total records should be 2001 that includes headers");

		boolean isSuccess = writeRecordsToCSV(filePath, records);
		Assert.assertTrue(isSuccess, "Successfully written all records to the CSV file");
	}

	@Test(enabled = true)
	public void testToReadAndUpdateTheCSVFileWithStudentAverageMarks() {
		String filePath = "C:\\Javaselenium\\eclipse-workspace\\utilPractice\\CSVData//studentRecords.csv";

		List<String[]> records = readRecordsFromCSV(filePath);
		Assert.assertNotNull(records);
		Assert.assertTrue(records.size() == 2001, "Total records should be 2001 that includes headers");

		records = updateStudentRecordsWithAverageMarks(records);
		Assert.assertNotNull(records);
		Assert.assertTrue(records.size() == 2001,
				"Total records should be 2001 that includes headers and new column AverageMarks for each record");

		boolean isSuccess = writeRecordsToCSV(filePath, records);
		Assert.assertTrue(isSuccess, "Successfully updated all records with AverageMarks to the CSV file");
	}

}
