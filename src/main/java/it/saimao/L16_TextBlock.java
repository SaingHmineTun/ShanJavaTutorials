package it.saimao;

public class L16_TextBlock {
    public static void main(String[] args) {

        String myHtml = "<html>\n" +
                "<head>"; // Escape character

        String html = """
                <html>
                    <head> 
                        <title> Hello </title>
                    </head>
                    <body>
                        <h1> Hello World </h1>
                    </body>
                </html>
                """;
        System.out.println(html);

    }
}
