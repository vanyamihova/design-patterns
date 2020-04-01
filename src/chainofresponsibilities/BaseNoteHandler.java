package chainofresponsibilities;

/**
 * This is base class for all handlers. It implements the logic for next {@link NoteHandler}
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 01.04.2020
 */
public abstract class BaseNoteHandler implements NoteHandler {

    protected NoteHandler nextNoteHandler;

    @Override
    public void setNextNoteHandler(NoteHandler noteHandler) {
        this.nextNoteHandler = noteHandler;
    }

}
