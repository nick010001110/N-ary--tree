public class Main {

    public static void main(String[] args) {

        Node N = new Node(5);
        N.addChild(new Node(7));
        N.addChild(new Node(9));
        N.addChild(new Node(11));
        N.getChildren().get(0).addChild(new Node(15));
        N.getChildren().get(0).addChild(new Node(17));
        N.getChildren().get(0).addChild(new Node(19));
        N.getChildren().get(2).addChild(new Node(21));
        N.getChildren().get(2).addChild(new Node(23));
        N.getChildren().get(0).getChildren().get(0).addChild(new Node(222));
        N.getChildren().get(2).getChildren().get(0).addChild(new Node(25));
        N.getChildren().get(2).getChildren().get(0).getChildren().get(0).addChild(new Node(27));
        System.out.println(N.searchDepth(N,21).getValue());

        System.out.println(N.searchBreadth(N, 25).getValue());




        /**
                      5
               /      |     \
              7       9      11
            /   |   \         |  \
         15   17   19        21  23
         |                    |
         222                 25
         |
         27
         **/

    }

}
