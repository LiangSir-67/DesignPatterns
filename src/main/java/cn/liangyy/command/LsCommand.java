package cn.liangyy.command;

/**
 * ls命令类
 */
public class LsCommand implements ICommand {
    private LinuxSystem linuxSystem;

    public LsCommand(LinuxSystem linuxSystem) {
        this.linuxSystem = linuxSystem;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        linuxSystem.ls();
    }
}
