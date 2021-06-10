package cn.liangyy.template;

/**
 * 抽象炒肉类
 */
public abstract class CookingMeat {
    protected final void cooking(){
        //1.放油
        this.putOil();
        //2.放入食材
        this.putMeat();
        //3.翻炒
        this.stirFry();
        //4.放盐
        this.putSalt();
        //5.放佐料（根据实际情况）
        if (this.needSeasoning()){
            this.putSeasoning();
        }
        //6.出锅
        this.disUp();
    }

    //放油
    final void putOil(){
        System.out.println("倒入适量食用油...");
    }

    //放入食材
    final void putMeat(){
        System.out.println("放入食材...");
    }

    //翻炒
    final void stirFry(){
        System.out.println("正在翻炒...");
    }

    //放点盐
    final void putSalt(){
        System.out.println("放盐...");
    }

    //放入其他佐料
    abstract void putSeasoning();

    /**
     * 钩子方法
     * 是否需要佐料，用于流程微调
     */
    protected boolean needSeasoning(){
        return true;
    }

    //出锅
    final void disUp(){
        System.out.println("好菜出锅...");
    }
}
