package resources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EmpDetJsonReader {

	public HashMap<String, String> employeeJsondata() {
		HashMap<String, String> hm = null;
		JSONParser jsonParser = new JSONParser();
		try {

			FileReader reader = new FileReader(
					"C:\\Javaselenium\\eclipse-workspace\\EmpDirJson\\src\\test\\java\\resources\\EmployeeDetails.json");

			// Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONObject employeeObject = (JSONObject) obj;
			hm = (HashMap<String, String>) employeeObject.get("employee");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/*
		 * System.out.println(hm.get("fullName"));
		 * System.out.println(hm.get("location"));
		 * System.out.println(hm.get("jobTitle"));
		 */

		return hm;
	}

}
