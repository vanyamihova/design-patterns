package visitor;

/**
 * A behavioral design pattern that lets you separate
 * algorithms from the objects on which they operate.
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
public class VisitorPatternMain {

    public static void main(String[] args) {
        XmlExportVisitor xmlExport = new XmlExportVisitor();

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        xmlExport.startXml();
        xmlExport.drawShape(circle);
        xmlExport.drawShape(rectangle);
        xmlExport.drawShape(square);
        xmlExport.endXml();
    }

}
