package visitor;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
abstract class Shape {

    abstract void accept(Visitor visitor);

}
