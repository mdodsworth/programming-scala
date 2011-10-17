import scala.xml._

val xmlTree = 
    <html>
        <title>this is a test</title>
    </html>
    <body>
        <h1 style="attribute"> this is a heading 1</h1>
        <h2/>
        <list>
            <element>this is a test</element>
            <element>this is another test</element>
            <element>this is a third test</element>
        </list>
    </body>;

println("title = "+ (xmlTree \ "title").text)
println("h1 = " + (xmlTree \ "h1").text)
println("h1 style = " + (xmlTree \ "h1" \ "@style").text)
println("elements = "+ (xmlTree \ "list"))

val name = "Bob"

val templateXml =
    <xml>
        <name>{name}</name>
        <address>some address that's not in a template</address>

        {for(style <- 1 to 25) yield
        <style>{style}</style>
        }
    </xml>

println("xml = " + templateXml)
