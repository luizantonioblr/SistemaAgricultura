package Negocio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    @Deprecated
    private DataUtil() {

    }

    public static Date obterData(String data) {
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            return df.parse(data);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Data Invalida");
        }
    }
}
