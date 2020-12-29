package cn.liangyy.composite.safe;

/**
 * 普通高考科目类（叶子节点）
 */
public class LeafCource extends GkAbstractCourse {
    public LeafCource(String name,String score){
        super(name,score);
    }
    /**
     * 获取课程信息
     */
    @Override
    public void info() {
        System.out.println("课程："+ this.name +"，分数："+ this.score);
    }
}
