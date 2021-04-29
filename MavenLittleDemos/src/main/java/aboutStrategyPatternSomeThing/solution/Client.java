package aboutStrategyPatternSomeThing.solution;

import aboutStrategyPatternSomeThing.problem.ProblemCauses;
import aboutStrategyPatternSomeThing.problem.Receipt;

import java.util.List;

/**
 * @Description 客户端
 * @Version
 * @Date 2021/4/29
 * @Author Gon
 */
public class Client
{
    public static void main(String[] args)
    {
        //模拟回执
        List<Receipt> receiptList = ProblemCauses.generateReceiptList();
        //策略上下文
        ReceiptStrategyContext receiptStrategyContext = new ReceiptStrategyContext();
        for (Receipt receipt : receiptList)
        {

            //获取并设置策略
            IReceiptHandleStrategy receiptHandleStrategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            receiptStrategyContext.setReceiptHandleStrategy(receiptHandleStrategy);
            //执行策略
            receiptStrategyContext.handleReceipt(receipt);
            IReceiptHandleStrategy receiptHandleStrategy2 = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());

        }
    }

}
