import scala.xml._

val xmlTree = 
    <html>
        <title>this is a test</title>
    </html>
    <body>
        <h1> this is a heading 1</h1>
        <h2/>
        <list>
            <element>this is a test</element>
            <element>this is another test</element>
            <element>this is a third test</element>
        </list>
    </body>;

println("title = "+ (xmlTree \ "title").text)
println("elements = "+ (xmlTree \ "list"))
