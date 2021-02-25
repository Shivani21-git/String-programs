package string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToDate {

  static   String date = "17/10/2020";
    public static void main(String[] args) throws ParseException {
        String str = "Hello";
        System.out.println(str);
        SimpleDateFormat tarik = new SimpleDateFormat("dd/MM/yyyy");
     Date date1 =   tarik.parse(date);
     System.out.println(date1);

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
    }
}
