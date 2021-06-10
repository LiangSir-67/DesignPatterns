package cn.liangyy.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝类
 */
public class BranchCource extends GkAbstractCourse {
    //子课程
    private List<GkAbstractCourse> courseList = new ArrayList<>();
    //层级
    private int level;

    public BranchCource(String name, String score, int level) {
        super(name, score);
        this.level = level;
    }

    //添加子课程
    public void addChild(GkAbstractCourse course){
        courseList.add(course);
    }

    /**
     * 获取课程信息
     */
    @Override
    public void info() {
        //打印课程信息
        System.out.println("课程："+ this.name +"，分数："+ this.score);
        for (GkAbstractCourse course : courseList) {
            for (int i = 0; i < level; i++) {
                //根据层级关系打印空格
                System.out.print("  ");
            }
            System.out.print(">");
            course.info();
        }
    }
}
