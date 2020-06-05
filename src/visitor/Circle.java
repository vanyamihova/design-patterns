package visitor;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
final class Circle extends Shape {

    @Override
    void accept(Visitor visitor) {
        visitor.drawShape(this);
    }
}
