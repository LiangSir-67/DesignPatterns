package cn.liangyy.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式-测试
 */
public class TestCommand {
    public static void main(String[] args) {
        //创建命令真正的执行者
        LinuxSystem linuxSystem = new LinuxSystem();

        //创建三个命令
        List<ICommand> commandList = new ArrayList<>();
        commandList.add(new CdCommand(linuxSystem));
        commandList.add(new LsCommand(linuxSystem));
        commandList.add(new RestartCommand(linuxSystem));

        //初始化命令请求者
        XshellInvoker xshellInvoker = new XshellInvoker(commandList);
        //执行指定命令
        xshellInvoker.execute(new LsCommand(linuxSystem));
        System.out.println("========================");
        //执行特定命令宏
        xshellInvoker.executeCdAndLs();
        System.out.println("========================");
        //执行全部命令
        xshellInvoker.executeAll();
    }
}
