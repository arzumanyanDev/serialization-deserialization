package model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

// Класс-обертка для списка организаций
@XmlRootElement(name = "organizations")
@Data
public class OrganizationList {

    private List<Organization> organizations;

    public OrganizationList() {
        organizations = new ArrayList<>();
    }
}
