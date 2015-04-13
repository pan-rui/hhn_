package com.hhn.dao;

import com.hhn.pojo.FundPayment;
import com.hhn.pojo.FundTransfer;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2014/12/3.
 */
@Repository
public interface IFundPaymentDao extends BaseDao<FundPayment> {

    public FundPayment queryPayment(Integer repayment_id);

}
