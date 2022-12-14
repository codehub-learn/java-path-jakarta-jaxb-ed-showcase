
package gr.codelearn.jaxb.example.domain;

import gr.codelearn.jaxb.example.adapter.CustomLocalDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement(name="Marvel")
@XmlType(propOrder={"color","name","localDateTime","abillityList"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Hero {
    @XmlAttribute
    private Integer id;
    @XmlElement(name="heroName")
    private String name;
    @XmlElement
    private String color;
    @XmlJavaTypeAdapter(CustomLocalDateTimeAdapter.class)
    private LocalDateTime localDateTime;
    @XmlElementWrapper(name="abillityList")
    @XmlElement(name = "abillity")
    private List<Abillity> abillityList;
    @XmlTransient
    private String doNotMarshal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public List<Abillity> getAbillityList() {
        return abillityList;
    }

    public void setAbillityList(List<Abillity> abillityList) {
        this.abillityList = abillityList;
    }

    public String getDoNotMarshal() {
        return doNotMarshal;
    }

    public void setDoNotMarshal(String doNotMarshal) {
        this.doNotMarshal = doNotMarshal;
    }
    
    

    public Hero(Integer id, String name, String color, LocalDateTime localDateTime, List<Abillity> abillityList, String doNotMarshal) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.localDateTime = localDateTime;
        this.abillityList = abillityList;
        this.doNotMarshal = doNotMarshal;
    }


    
    public Hero() {}

    @Override
    public String toString() {
        return "Hero{" + "id=" + id + ", name=" + name + ", color=" + color + ", localDateTime=" + localDateTime + ", abillityList=" + abillityList + ", doNotMarshal=" + doNotMarshal + '}';
    }
    

}
