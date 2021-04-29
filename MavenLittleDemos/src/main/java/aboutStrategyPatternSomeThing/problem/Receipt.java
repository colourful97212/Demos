package aboutStrategyPatternSomeThing.problem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @Version
 * @Date 2021/4/22
 * @Author Gon
 */

@Data
@AllArgsConstructor
@ToString
public class Receipt
{
    /**
     * 回执信息
     */
    private String message;

    /**
     * 回执类型(`MT1101、MT2101、MT4101、MT8104、MT8105、MT9999`)
     */
    private String type;

}
