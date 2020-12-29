package cn.liangyy.command;

/**
 * cd 命令类
 */
public class CdCommand implements ICommand {
    //持有真正的命令执行者 Linux 操作系统
    private LinuxSystem linuxSystem;

    public CdCommand(LinuxSystem linuxSystem) {
        this.linuxSystem = linuxSystem;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        //调用真正的执行者来执行命令
        linuxSystem.cd();
    }
}
