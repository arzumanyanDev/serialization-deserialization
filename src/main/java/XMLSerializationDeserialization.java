import model.Organization;
import model.OrganizationList;
import model.Status;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLSerializationDeserialization {

    private final String fileName = "organizations.xml";


    public File serialize(OrganizationList organizationList) {

        File file = new File(fileName);

        // Выполнение сериализации в XML
        try {
            JAXBContext context = JAXBContext.newInstance(OrganizationList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(organizationList, file);
            System.out.println("Сериализация выполнена. Результат сохранен в файл organizations.xml");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return file;
    }

    public void deserialize(File file) {
        // Выполнение десериализации из XML и вывод открытых организаций
        try {
            JAXBContext context = JAXBContext.newInstance(OrganizationList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            OrganizationList deserializedList = (OrganizationList) unmarshaller.unmarshal(file);

            System.out.println("Открытые организации:");
            for (Organization org : deserializedList.getOrganizations()) {
                if (org.getStatus() == Status.OPEN) {
                    System.out.println("Название: " + org.getName());
                    System.out.println("Дата создания: " + org.getCreationDate());
                    System.out.println();
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
