package xin.wangning.domain;

public class Privacy {
    private String uuid;
    private int name_range;
    private int age_range;
    private int sex_range;
    private int pull_range;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getName_range() {
        return name_range;
    }

    public void setName_range(int name_range) {
        this.name_range = name_range;
    }

    public int getAge_range() {
        return age_range;
    }

    public void setAge_range(int age_range) {
        this.age_range = age_range;
    }

    public int getSex_range() {
        return sex_range;
    }

    public void setSex_range(int sex_range) {
        this.sex_range = sex_range;
    }

    public int getPull_range() {
        return pull_range;
    }

    public void setPull_range(int pull_range) {
        this.pull_range = pull_range;
    }
}
