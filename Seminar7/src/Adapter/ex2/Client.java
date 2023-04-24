package Adapter.ex2;

public class Client {
    public static void main(String[] args) {
        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new XmlToJsonAdapter(xmlParser);
        jsonParser.parseJson("{ \"name\": \"John\", \"age\": 30 }");
    }
}
