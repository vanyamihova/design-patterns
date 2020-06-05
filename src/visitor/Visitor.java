package visitor;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
interface Visitor {

    void drawShape(Circle circle);

    void drawShape(Rectangle rectangle);

    void drawShape(Square square);

}
