package chainofresponsibilities;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 01.04.2020
 */
interface NoteHandler {

    void setNextNoteHandler(NoteHandler noteHandler);

    void withdraw(int amount);

}
