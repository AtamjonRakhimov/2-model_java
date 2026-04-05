package pdpuz.Comparator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlGenerator {

    public static void generate(List<Person> people) {
        StringBuilder sb = new StringBuilder();

        sb.append("""
                <html>
                <head>
                    <style>
                        table { border-collapse: collapse; width: 50%; }
                        th, td { border: 1px solid black; padding: 8px; text-align: left; }
                        th { background-color: #f2f2f2; }
                    </style>
                </head>
                <body>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>name</th>
                        <th>gender</th>
                        <th>age</th>
                    </tr>
                """);

        for (Person p : people) {
            sb.append("<tr>")
                    .append("<td>").append(p.getId()).append("</td>")
                    .append("<td>").append(p.getName()).append("</td>")
                    .append("<td>").append(p.getGender()).append("</td>")
                    .append("<td>").append(p.getAge()).append("</td>")
                    .append("</tr>");
        }

        sb.append("""
                </table>
                </body>
                </html>
                """);

        try (FileWriter fw = new FileWriter("xyz.html")) {
            fw.write(sb.toString());
            System.out.println("xyz.html yaratildi! Brauzerda oching.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

