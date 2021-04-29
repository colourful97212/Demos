package aboutStrategyPatternSomeThing.solution;

import aboutStrategyPatternSomeThing.problem.Receipt;

/**
 * @Description
 * @Version
 * @Date 2021/4/29
 * @Author Gon
 */
public class Mt8104ReceiptHandleStrategy implements IReceiptHandleStrategy
{
    @Override
    public void handleReceipt(Receipt receipt)
    {
        System.out.println("解析报文MT8104:" + receipt.getMessage());
    }
}
