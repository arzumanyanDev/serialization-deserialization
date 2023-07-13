import model.OrganizationList;

import java.io.File;

public class Application {

    /*

    После запуска этого кода будут выполнены следующие действия:

    1 - Создается список организаций и заполняется данными.
    2 - Выполняется сериализация списка организаций в XML и сохранение результата в файл "organizations.xml".
    3 - Выполняется десериализация из файла "organizations.xml" и вывод в консоль только открытых организаций.
    4 - Генерируется XSD-файл "organization.xsd" на основе модели данных.

    */

    public static void main(String[] args) {
        GenerateOrganization generateOrganization = new GenerateOrganization();
        OrganizationList organizationList = generateOrganization.generate();
        XMLSerializationDeserialization serializationDeserialization = new XMLSerializationDeserialization();
        File serializedOrganization = serializationDeserialization.serialize(organizationList);
        serializationDeserialization.deserialize(serializedOrganization);
        XSDGenerator xsdGenerator = new XSDGenerator();
        xsdGenerator.generate();
    }
}
