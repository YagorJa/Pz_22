package by.teachmeskills.shopik.jaxb;

import by.teachmeskills.shopik.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbMain {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(StudentList.class);

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            StudentList studentList = (StudentList) unmarshaller.unmarshal(new File("C:\\Users\\Yagor\\OneDrive\\Рабочий стол\\курсы\\file.xml"));
            System.out.println(studentList.getStudents().toString());

            Marshaller marshaller=jc.createMarshaller();
            Student student=new Student();
            student.setName("Ivan");
            student.setLogin("ivan123");
            student.setFaculty("mmf");
            student.setTelephone("1234");
            marshaller.marshal(student, new File("C:\\Users\\Yagor\\OneDrive\\Рабочий стол\\курсы\\m"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
