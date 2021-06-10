package cn.liangyy.composite.transparency;

/**
 * 高考科目的抽象类
 */
public abstract class GkAbstractCourse {
    /**
     * 添加子节点
     * @param course
     */
    public void addChild(GkAbstractCourse course){
        System.out.println("不支持添加操作！");
    }

    /**
     * 获取当前节点名称
     * @return
     * @throws Exception
     */
    public String getName() throws Exception {
        throw new Exception("不支持获取名称！");
    }

    /**
     * 获取高考科目信息
     * @throws Exception
     */
    public void info() throws Exception {
        throw new Exception("不支持查询信息操作！");
    }
}
