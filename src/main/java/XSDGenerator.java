import model.OrganizationList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;

public class XSDGenerator {

    public void generate() {

        // Генерация XSD-файла
        try {
            JAXBContext context = JAXBContext.newInstance(OrganizationList.class);
            SchemaOutputResolver sor = new XSDSchemaOutputResolver();
            context.generateSchema(sor);
            System.out.println("Генерация XSD выполнена. Результат сохранен в файл organization.xsd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
