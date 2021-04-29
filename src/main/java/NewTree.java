public class NewTree {
    private Node rootNode;

    public void newNode(int key, String value) {
        Node node1 = new Node();
        node1.setKey();
        node1.setValue();
        Node currentNode = rootNode;
        Node parentNode;
        if (rootNode == null) {
            rootNode = node1;
        } else {
            rootNode = currentNode;
            parentNode = currentNode;
        }
        while (true) {
            parentNode = currentNode;
            if (currentNode.getKey() == key) {
                return;
            } else if (currentNode.getKey() >= key) {
                currentNode = currentNode.getRight();
                if (currentNode == null) {
                    parentNode.setRight();
                }
            } else if (currentNode.getKey() < key) {
                currentNode = currentNode.getLeft();
                if (currentNode == null) {
                    parentNode.setLeft();
                }

            }
        }
    }

    public void searchByKey(int key) {
        Node currentNode = rootNode;
        while (currentNode.getKey() != key){
            if (currentNode.getKey() >= key){
                currentNode = currentNode.getRight();
            }
            else if (currentNode.getKey() < key){
                currentNode = currentNode.getLeft();
            }
            if (currentNode == null){
                return;
            }
        }

    }
}