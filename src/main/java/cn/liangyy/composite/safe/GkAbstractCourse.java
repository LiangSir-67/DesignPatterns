package cn.liangyy.composite.safe;

/**
 * 抽象课程类（顶层）
 */
public abstract class GkAbstractCourse {
    //课程名称
    protected String name;
    //课程分数
    protected String score;

    public GkAbstractCourse(String name, String score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 获取课程信息
     */
    public abstract void info();
}