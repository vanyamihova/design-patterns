package chainofresponsibilities;

/**
 * Twenty Note handler
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 01.04.2020
 */
final class TwentyNoteHandler extends BaseNoteHandler {

    private static final int NOTE_AMOUNT = 20;

    @Override
    public void withdraw(int amount) {
        if (amount >= NOTE_AMOUNT) {
            int notes = amount / NOTE_AMOUNT;
            amount -= (notes * NOTE_AMOUNT);
            System.out.println("Withdraws " + notes + " x $" + NOTE_AMOUNT);
        }
        nextNoteHandler.withdraw(amount);
    }

}
