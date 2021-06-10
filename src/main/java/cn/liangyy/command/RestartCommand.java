package cn.liangyy.command;

/**
 * restart命令类
 */
public class RestartCommand implements ICommand {
    private LinuxSystem linuxSystem;

    public RestartCommand(LinuxSystem linuxSystem) {
        this.linuxSystem = linuxSystem;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        linuxSystem.restart();
    }
}
