package cn.liangyy.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令的请求在类
 */
public class XshellInvoker {
    //封装了命令的list集合
    private List<ICommand> commandList = new ArrayList<>();

    public XshellInvoker(List<ICommand> commandList) {
        this.commandList = commandList;
    }

    /**
     * 执行指定命令
     * @param command
     */
    public void execute(ICommand command){
        command.execute();
    }

    /**
     * 执行命令宏，即执行特定的几个命令组合
     */
    public void executeCdAndLs(){
        for (ICommand command : commandList){
            //只执行待定的命令宏
            if (command instanceof LsCommand || command instanceof CdCommand){
                command.execute();
            }
        }
    }

    /**
     * 执行全部命令
     */
    public void executeAll(){
        //通过循环的方式执行每一条命令
        for (ICommand command : commandList){
            command.execute();
        }
    }
}
