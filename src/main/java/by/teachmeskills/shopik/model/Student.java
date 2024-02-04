package by.teachmeskills.shopik.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@XmlRootElement(name = "student")
public class Student {
    private String login;
    private String faculty;
    private String name;
    private String telephone;
    private Address address;
    @XmlAttribute(name = "login")
    public String getLogin(){return login;}
    public void setLogin(String login){this.login = login;}

    @XmlAttribute(name = "faculty")
    public String getFaculty(){return faculty;}
    public void setFaculty(String faculty){this.faculty = faculty;}

    @XmlElement(name = "name")
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    @XmlElement(name = "telephone")
    public String getTelephone(){return telephone;}
    public void setTelephone(String telephone){this.telephone = telephone;}

    @XmlElement(name = "address")
    public Address getAddress(){return address;}
    public void setAddress(Address address){this.address = address;}

    @Override
    public String toString() {
        return "Student{" +
                "login='" + login + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
