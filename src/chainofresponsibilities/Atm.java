package chainofresponsibilities;

/**
 * Chain of Responsibility
 * <p>
 * A behavioral design pattern that lets you pass requests along a
 * chain of handlers. Upon receiving a request, each handler
 * decides either to process the request or to pass it to the next
 * handler in the chain.
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 01.04.2020
 */
public class Atm {

    public static void main(String[] args) {
        HundredNoteHandler hundredNoteHandler = new HundredNoteHandler();
        FiftyNoteHandler fiftyNoteHandler = new FiftyNoteHandler();
        TwentyNoteHandler twentyNoteHandler = new TwentyNoteHandler();
        TenNoteHandler tenNoteHandler = new TenNoteHandler();

        hundredNoteHandler.setNextNoteHandler(fiftyNoteHandler);
        fiftyNoteHandler.setNextNoteHandler(twentyNoteHandler);
        twentyNoteHandler.setNextNoteHandler(tenNoteHandler);

        hundredNoteHandler.withdraw(180);
    }

}
