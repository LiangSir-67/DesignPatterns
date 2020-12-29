package cn.liangyy.composite.transparency;

/**
 * 普通高考科目类（叶子节点）
 * 无法包含其他科目
 */
public class LeafCource extends GkAbstractCourse {
    //课程名称
    private String name;
    //课程分数
    private String score;

    public LeafCource(String name, String score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 获取当前节点名称
     * @return
     * @throws Exception
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 获取高考科目信息
     * @throws Exception
     */
    @Override
    public void info() {
        System.out.println("课程："+ this.name + "，分数："+ score);
    }
}
