package by.teachmeskills.shopik.jaxb;

import by.teachmeskills.shopik.model.Order;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderList {
    @XmlElement(name = "store")
    private List<Order> orders;

    @Override
    public String toString() {
        return "OrderList{" +
                "orders=" + orders +
                '}';
    }
}
