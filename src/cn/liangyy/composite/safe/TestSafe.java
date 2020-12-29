package cn.liangyy.composite.safe;

/**
 * 安全模式-测试
 */
public class TestSafe {
    public static void main(String[] args) {
        GkAbstractCourse ywCourse = new LeafCource("语文","150");
        GkAbstractCourse sxCourse = new LeafCource("数学","150");
        GkAbstractCourse yyCourse = new LeafCource("英语","150");

        GkAbstractCourse wlCourse = new LeafCource("物理","110");
        GkAbstractCourse hxCourse = new LeafCource("化学","100");
        GkAbstractCourse swCourse = new LeafCource("生物","90");

        BranchCource lzCourse = new BranchCource("理综","300",2);
        lzCourse.addChild(wlCourse);
        lzCourse.addChild(hxCourse);
        lzCourse.addChild(swCourse);

        BranchCource lkgkCourse = new BranchCource("理科高考","750",1);
        lkgkCourse.addChild(ywCourse);
        lkgkCourse.addChild(sxCourse);
        lkgkCourse.addChild(yyCourse);

        lkgkCourse.addChild(lzCourse);
        lkgkCourse.info();
    }
}
