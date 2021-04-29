package aboutStrategyPatternSomeThing.solution;

import aboutStrategyPatternSomeThing.problem.Receipt;

/**
 * @Description 上下文类，持有策略接口
 * @Version
 * @Date 2021/4/29
 * @Author Gon
 */
public class ReceiptStrategyContext
{
    private IReceiptHandleStrategy receiptHandleStrategy;

    /**
     * 设置策略接口
     *
     * @param receiptHandleStrategy
     */
    public void setReceiptHandleStrategy(IReceiptHandleStrategy receiptHandleStrategy)
    {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    public void handleReceipt(Receipt receipt)
    {
        if (receiptHandleStrategy != null)
        {
            receiptHandleStrategy.handleReceipt(receipt);
        }
    }
}
