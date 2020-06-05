package visitor;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
final class XmlExportVisitor implements Visitor {

    void startXml() {
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println("<shapes>");
    }

    void endXml() {
        System.out.println("</shapes>");
    }

    @Override
    public void drawShape(Circle circle) {
        System.out.println("\t<shape>Circle<shape>");
    }

    @Override
    public void drawShape(Rectangle rectangle) {
        System.out.println("\t<shape>Rectangle<shape>");
    }

    @Override
    public void drawShape(Square square) {
        System.out.println("\t<shape>Square<shape>");
    }

}
