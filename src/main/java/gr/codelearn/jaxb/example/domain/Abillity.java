package gr.codelearn.jaxb.example.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="gr.codelearn.jaxb.example.domain")
@XmlAccessorType(XmlAccessType.FIELD)
public class Abillity {
    @XmlElement
    private Long id;
    @XmlElement(required=true)
    private String name;
    @XmlElement(required=true)
    private Integer powerStatistic;

    public Abillity(Long id, String name, Integer powerStatistic) {
        this.id = id;
        this.name = name;
        this.powerStatistic = powerStatistic;
    }

    public Abillity() {
    }

    @Override
    public String toString() {
        return "Abillity{" + "id=" + id + ", name=" + name + ", powerStatistic=" + powerStatistic + '}';
    }
    
    
    
}
