package br.com.parebem.version13;

public class TextBlocks {
    public static void main(String[] args) {
        String JSON_STRING
                = "{\r\n" + "\"name\" : \"Baeldung\",\r\n" + "\"website\" : \"https://www.%s.com/\"\r\n" + "}";

        String TEXT_BLOCK_JSON = """
        {
            "name" : "Baeldung",
            "website" : "https://www.%s.com/"
        }
        """;

        System.out.println(JSON_STRING);
        System.out.println(TEXT_BLOCK_JSON);

        System.out.println(String.format(JSON_STRING, "google"));
        System.out.println(TEXT_BLOCK_JSON.formatted("google"));

        var a = "123";

        System.out.println(a);

        doSomething("123");
    }

    static void doSomething(String a) {
        var b = a;

    }
}
