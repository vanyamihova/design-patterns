package composite;

/**
 * A structural design pattern that lets you compose
 * objects into tree structures and then work with
 * these structures as if they were individual objects.
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
public class CompositePatternMain {

    public static void main(String[] args) {
        FileNode javaMainFileNode = new FileNode("ApplicationMain.java");
        FileNode componentFileNode = new FileNode("Component.java");
        DirectoryNode sourceDirectoryNode = new DirectoryNode("src");
        sourceDirectoryNode.addNode(javaMainFileNode);
        sourceDirectoryNode.addNode(componentFileNode);

        FileNode readMeFileNode = new FileNode("README.md");

        FileSystem fileSystem = new FileSystem();

        System.out.println("List the nodes after creating files on the system");
        fileSystem.addNode(sourceDirectoryNode);
        fileSystem.addNode(readMeFileNode);
        fileSystem.listNodes();

        System.out.println("\nList the nodes after removing one of the nodes");
        sourceDirectoryNode.removeNode(componentFileNode);
        fileSystem.listNodes();
    }
}
