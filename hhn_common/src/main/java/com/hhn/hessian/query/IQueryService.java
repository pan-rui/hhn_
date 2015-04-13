package com.hhn.hessian.query;

import com.hhn.util.BaseReturn;

import java.math.BigDecimal;

/**
 * 查询用户余额,代收本金,冻结金额,已赚利息,待收利息,其它收益
 * Created by hynpublic on 2014/12/26.
 */
public interface IQueryService {
    /**
     * 用户余额
     * @param userId
     * @return
     */
    public BaseReturn queryUserBalance(Integer userId);

    /**
     * 可投金额
     * @return
     */
    public BaseReturn queryPay();

    /**
     * 代收本金
     * @param userId
     * @return
     */
    public BaseReturn queryPrincipal(Integer userId);

    /**
     * 冻结金额
     * @param userId
     * @return
     */

    public BaseReturn queryFreeze(Integer userId);

    /**
     * 已赚利息
     * @param userId
     * @return
     */

    public BaseReturn queryInterested(Integer userId);

    /**
     * 代收利息
     * @param userId
     * @return
     */

    public BaseReturn queryInterest(Integer userId);

    /**
     * 其它收益
     * @param userId
     * @return
     */

    public BaseReturn queryOtherInterest(Integer userId);

    /**
     * 查询手机号
     * @param userId
     * @return
     */

    public BaseReturn queryPhone(Integer userId);
}
