package gr.codelearn.jaxb.example.adapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomLocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime>{
    DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("EEEE dd MMMM y HH:mm:ss");

    @Override
    public LocalDateTime unmarshal(String v) throws Exception {
        return LocalDateTime.parse(v,dateTimeFormatter);
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {
        return dateTimeFormatter.format(v);
    }
    
}
