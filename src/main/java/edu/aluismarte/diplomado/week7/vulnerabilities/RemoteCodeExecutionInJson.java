package edu.aluismarte.diplomado.week7.vulnerabilities;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.aluismarte.diplomado.model.week7.Product;

import java.io.IOException;

/**
 * Como puedo hacer ejecución de data remota usando un JSON
 *
 * @author aluis on 5/8/2022.
 * @see <a href="https://bbossola.wordpress.com/2018/04/14/remotely-execute-java-code-using-json/">remotely-execute-java-code-using-json</a>
 * @see <a href="https://github.com/bbossola/vulnerability-java-samples">vulnerability-java-samples</a>
 */
public class RemoteCodeExecutionInJson {

    private static final ObjectMapper deserializer = new ObjectMapper().enableDefaultTyping();

    public void simulatePOSTRequest(String json)  throws IOException, JsonParseException, JsonMappingException {
        try {
            deserializer.readValue(json, Product.class);
        } catch (Exception ignored) {
        }
    }
}
