package aboutStrategyPatternSomeThing.solution;

import aboutStrategyPatternSomeThing.problem.Receipt;

/**
 * @Description
 * @Version
 * @Date 2021/4/22
 * @Author Gon
 */
public class Mt1101ReceiptHandleStrategy implements IReceiptHandleStrategy
{
    @Override
    public void handleReceipt(Receipt receipt)
    {
        System.out.println("解析报文MT1101:" + receipt.getMessage());
    }
}
