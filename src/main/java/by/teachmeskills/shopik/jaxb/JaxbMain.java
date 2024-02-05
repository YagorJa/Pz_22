package by.teachmeskills.shopik.jaxb;

import by.teachmeskills.shopik.model.Order;
import by.teachmeskills.shopik.model.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class JaxbMain {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(OrderList.class);

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            OrderList orderList = (OrderList) unmarshaller.unmarshal(new File("C:\\Users\\Yagor\\OneDrive\\Рабочий стол\\курсы\\order.xml"));
            System.out.println(orderList.getOrders().toString());

            Marshaller marshaller = jc.createMarshaller();
            Order order = new Order();
            order.setName("Example Order");
            order.setDate("2024-02-04");

            Product product1 = new Product();
            product1.setType("Product 1");
            product1.setPrice("50.00");

            Product product2 = new Product();
            product2.setType("Product 2");
            product2.setPrice("30.00");

            order.setProducts(List.of(product1, product2));

            marshaller.marshal(order, new File("C:\\Users\\Yagor\\OneDrive\\Рабочий стол\\курсы\\output.xml"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
