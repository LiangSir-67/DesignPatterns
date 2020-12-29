package cn.liangyy.command;

/**
 * Linux操作系统类
 */
public class LinuxSystem {
    public void cd(){
        System.out.println("已经切换到主目录！");
    }

    public void ls(){
        System.out.println("已经列举出当前目录下所有文件！");
    }

    public void restart(){
        System.out.println("开启重启系统！");
    }
}
