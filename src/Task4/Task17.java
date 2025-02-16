package Task4;
import java.util.ArrayList;
import java.util.List;

class Leaf {
    private String color;
    private boolean isFrosted;

    public Leaf(String color) {
        this.color = color;
        this.isFrosted = false;
    }

    public void frost() {
        isFrosted = true;
        color = "white";
    }

    public void yellow() {
        color = "yellow";
    }

    public String getColor() {
        return color;
    }

    public boolean isFrosted() {
        return isFrosted;
    }
}

class Branch {
    private List<Leaf> leaves;

    public Branch(int numberOfLeaves) {
        leaves = new ArrayList<>();
        for (int i = 0; i < numberOfLeaves; i++) {
            leaves.add(new Leaf("green"));
        }
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void fall() {
        leaves.clear();
    }
}

class Tree {
    private List<Branch> branches;

    public Tree(int numberOfBranches, int leavesPerBranch) {
        branches = new ArrayList<>();
        for (int i = 0; i < numberOfBranches; i++) {
            branches.add(new Branch(leavesPerBranch));
        }
    }

    public void bloom() {
        System.out.println("Tree is blooming!");
    }

    public void shedLeaves() {
        for (Branch branch : branches) {
            branch.fall();
        }
        System.out.println("Leaves have fallen!");
    }

    public void frostLeaves() {
        for (Branch branch : branches) {
            for (Leaf leaf : branch.getLeaves()) {
                leaf.frost();
            }
        }
        System.out.println("Leaves are frosted!");
    }

    public void yellowLeaves() {
        for (Branch branch : branches) {
            for (Leaf leaf : branch.getLeaves()) {
                leaf.yellow();
            }
        }
        System.out.println("Leaves have turned yellow!");
    }

    public static void main(String[] args) {
        Tree tree = new Tree(3, 5);
        tree.bloom();
        tree.yellowLeaves();
        tree.frostLeaves();
        tree.shedLeaves();
    }
}
