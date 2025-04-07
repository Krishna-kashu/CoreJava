package Runner;

import com.xworkz.god.external.Hiker;
import com.xworkz.god.internal.Forest;
import com.xworkz.god.internal.Tree;

public class ForestRunner {
    public static void main(String[] args) {
        Forest forest= new Forest();
        forest.explore();

        Hiker hiker= new Hiker();
        hiker.exploreForest();

        Tree tree= new Tree();
        tree.grow();
    }
}
