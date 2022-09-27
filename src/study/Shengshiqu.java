package study;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cmy
 * @version 1.0
 * @date 2022/6/8 20:47
 * @description 省市区
 */
public class Shengshiqu {

    private Long countryId;
    private String countryName;
    private Long shengId;
    private String shengName;
    private Long shiId;
    private String shiName;
    private Long quId;
    private String quName;

    private List<Shengshiqu> nodes=new LinkedList<>();

    public Shengshiqu() {
        super();
    }

    public Shengshiqu(Long countryId, String countryName, Long shengId, String shengName, Long shiId, String shiName, Long quId, String quName) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.shengId = shengId;
        this.shengName = shengName;
        this.shiId = shiId;
        this.shiName = shiName;
        this.quId = quId;
        this.quName = quName;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Shengshiqu> getNodes() {
        return nodes;
    }

    public void setNodes(List<Shengshiqu> nodes) {
        this.nodes = nodes;
    }

    public Long getShengId() {
        return shengId;
    }

    public void setShengId(Long shengId) {
        this.shengId = shengId;
    }

    public String getShengName() {
        return shengName;
    }

    public void setShengName(String shengName) {
        this.shengName = shengName;
    }

    public Long getShiId() {
        return shiId;
    }

    public void setShiId(Long shiId) {
        this.shiId = shiId;
    }

    public String getShiName() {
        return shiName;
    }

    public void setShiName(String shiName) {
        this.shiName = shiName;
    }

    public Long getQuId() {
        return quId;
    }

    public void setQuId(Long quId) {
        this.quId = quId;
    }

    public String getQuName() {
        return quName;
    }

    public void setQuName(String quName) {
        this.quName = quName;
    }


    @Override
    public String toString() {
        return "Shengshiqu{" +
                "shengId=" + shengId +
                ", shengName='" + shengName + '\'' +
                ", shiId=" + shiId +
                ", shiName='" + shiName + '\'' +
                ", quId=" + quId +
                ", quName='" + quName + '\'' +
                ", nodes=" + nodes +
                '}';
    }
}
