package aboutStrategyPatternSomeThing.solution;

import aboutStrategyPatternSomeThing.problem.Receipt;

/**
 * @Description
 * @Version
 * @Date 2021/4/29
 * @Author Gon
 */
public class Mt9999ReceiptHandleStrategy implements IReceiptHandleStrategy
{
    @Override
    public void handleReceipt(Receipt receipt)
    {
        System.out.println("解析报文MT9999:" + receipt.getMessage());
    }
}
