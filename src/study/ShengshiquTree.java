package study;

import java.util.List;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/6/8 21:33
 * @description 省市区树
 */
public class ShengshiquTree {

    private Long parentId;
    private Long id;
    private String name;
    private List<ShengshiquTree> children;

    public ShengshiquTree() {
        super();
    }

    public ShengshiquTree(Long parentId, Long id, String name, List<ShengshiquTree> children) {
        this.parentId = parentId;
        this.id = id;
        this.name = name;
        this.children = children;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShengshiquTree> getChildren() {
        return children;
    }

    public void setChildren(List<ShengshiquTree> children) {
        this.children = children;
    }
}
