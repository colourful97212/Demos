package aboutStrategyPatternSomeThing.solution;

import aboutStrategyPatternSomeThing.problem.Receipt;

/**
 * @Description  回执处理策略接口
 * @Version
 * @Date 2021/4/22
 * @Author Gon
 */
public interface IReceiptHandleStrategy
{
    void handleReceipt(Receipt receipt);
}
