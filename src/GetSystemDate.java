import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSystemDate {

	public static void main(String[] args) {
		
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		Date d = new Date();
		System.out.println(date.format(d));
		

	}

}
