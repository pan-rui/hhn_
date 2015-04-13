package com.hhn.service.impl;

import com.hhn.dao.IFundTradeDao;
import com.hhn.dao.IFundUserAccountDao;
import com.hhn.pojo.FundUserAccount;
import com.hhn.util.Base;
import com.hhn.util.BaseReturn;
import com.hhn.util.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hynpublic on 2014/12/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QueryServiceImpl extends BaseService<FundUserAccount> {

    @Resource
    private IFundUserAccountDao fundUserAccountDao;
    @Resource
    private IFundTradeDao fundTradeDao;
    public BaseReturn queryUserBalance(Integer userId) {
        FundUserAccount userAccount = fundUserAccountDao.queryUserAccount(userId);
        return new BaseReturn(0, userAccount==null?new FundUserAccount():userAccount);
    }

    public BaseReturn queryPrincipal(Integer userId) {
        return null;
    }

    public BaseReturn queryFreeze(Integer usesrId) {
        return null;
    }

    public BaseReturn queryInterested(Integer userId) {
        return null;
    }

    public BaseReturn queryInterest(Integer userId) {
        return null;
    }

    public BaseReturn queryOtherInterest(Integer userId) {
        return null;
    }

    public BaseReturn queryPhone(Integer userId) {
       return new BaseReturn(0,fundUserAccountDao.queryPhone(userId));
    }

    public BaseReturn queryPay() {
        BigDecimal bigDecimal=fundTradeDao.queryPay(new Date(), IFundTradeDao.TradeType.INVESTMENT.name());
        return new BaseReturn(bigDecimal==null?1:0,bigDecimal);
    }
}
