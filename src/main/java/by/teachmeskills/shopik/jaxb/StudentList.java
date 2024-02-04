package by.teachmeskills.shopik.jaxb;

import by.teachmeskills.shopik.model.Student;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "students")
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentList {
    @XmlElement(name = "student")
    private List<Student> students;

    @Override
    public String toString() {
        return "StudentList{" +
                "students=" + students +
                '}';
    }
}

