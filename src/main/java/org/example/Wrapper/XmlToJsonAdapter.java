package org.example.Wrapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlToJsonAdapter {
    public static String convertXmlToJson(String xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        JsonNode node = mapper.readTree(xml.getBytes());
        return node.toPrettyString();
    }
}
