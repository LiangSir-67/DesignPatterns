package cn.liangyy.composite.transparency;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝类
 * 可以包含其他科目的类
 */
public class BranchCource extends GkAbstractCourse {
    private List<GkAbstractCourse> courseList = new ArrayList<>();
    //科目名称
    private String name;
    //层级
    private int level;

    public BranchCource(String name, int level) {
        this.name = name;
        this.level = level;
    }

    /**
     * 添加子节点（子课程）
     * @param course
     */
    @Override
    public void addChild(GkAbstractCourse course) {
        courseList.add(course);
    }

    /**
     * 获取当前节点名称（课程名称）
     * @return
     * @throws Exception
     */
    @Override
    public String getName() throws Exception {
        return this.name;
    }

    /**
     * 获取高考科目信息
     * @throws Exception
     */
    @Override
    public void info() throws Exception {
        //打印课程信息
        System.out.println("课程："+this.name);
        for (GkAbstractCourse course : courseList) {
            //根据层级关系打印空格，这样打印结果可以明显看出层级关系
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.print(">");
            course.info();
        }
    }
}
