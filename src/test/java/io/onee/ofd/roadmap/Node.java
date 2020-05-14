package io.onee.ofd.roadmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by admin on 2020/5/14 17:58:49.
 */
public class Node {
    String     title;
    int type = 1;//1:file,2:directory
    List<Node> children = new ArrayList<Node>();
    
    public Node(String title) {
        this.title = title;
    }
    
    public Node addChild(Node node) {
        children.add(node);
        return this;
    }
    
    public int childLength() {
        return this.children.size();
    }
    
    public Node addChild(String title) {
        Node n = new Node(title);
        n.type = 1;
        children.add(n);
        return this;
    }
    
    public Node addFolder(String title) {
        Node n = new Node(title);
        n.type = 2;
        children.add(n);
        return n;
    }
    
    public String toString(String lftStr, String append) {
        compare();
        StringBuilder b = new StringBuilder();
        b.append(append + title);
        b.append("\n");
        if (children.size() > 0) {
            for (int i = 0; i < children.size() - 1; i++) {
                b.append(lftStr + children.get(i).toString(lftStr + "│ ", "├─"));
            }
            b.append(lftStr + children.get(children.size() - 1).toString(lftStr + "  ", "└─"));
            
        }
        return b.toString();
    }
    private void compare() {
        //(o1, o2) -> o1.children.size() > o2.children.size() ? 1 : 0
        children = children
                .stream()
                .sorted(Comparator.comparingInt(Node::childLength).reversed())
                .collect(Collectors.toList());
    }
}
