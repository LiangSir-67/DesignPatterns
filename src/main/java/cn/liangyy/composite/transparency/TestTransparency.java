package cn.liangyy.composite.transparency;

/**
 * 透明模式-测试
 */
public class TestTransparency {
    public static void main(String[] args) throws Exception {
        GkAbstractCourse ywCourse = new LeafCource("语文","150");
        GkAbstractCourse sxCourse = new LeafCource("数学","150");
        GkAbstractCourse yyCourse = new LeafCource("英语","150");

        GkAbstractCourse wlCourse = new LeafCource("物理","110");
        GkAbstractCourse hxCourse = new LeafCource("化学","100");
        GkAbstractCourse swCourse = new LeafCource("生物","90");

        GkAbstractCourse lzCourse = new BranchCource("理综",2);
        lzCourse.addChild(wlCourse);
        lzCourse.addChild(hxCourse);
        lzCourse.addChild(swCourse);

        GkAbstractCourse lkgkCourse = new BranchCource("理科高考",1);
        lkgkCourse.addChild(ywCourse);
        lkgkCourse.addChild(sxCourse);
        lkgkCourse.addChild(yyCourse);

        lkgkCourse.addChild(lzCourse);
        lkgkCourse.info();

        //这里会输出"不支持添加操作！"，叶子节点无法再添加
        ywCourse.addChild(sxCourse);
    }
}
