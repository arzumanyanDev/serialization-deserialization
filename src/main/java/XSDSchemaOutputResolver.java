import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XSDSchemaOutputResolver extends SchemaOutputResolver {

    @Override
    public Result createOutput(String namespaceUri, String suggestedFileName) {
        suggestedFileName = "organization.xsd";
        File file = new File(suggestedFileName);
        StreamResult result = new StreamResult(file);
        result.setSystemId(file.toURI().toString());
        return result;
    }
}
