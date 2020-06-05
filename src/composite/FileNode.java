package composite;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
final class FileNode implements Node {

    private String name;

    FileNode(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: \t\t " + name);
    }

}
