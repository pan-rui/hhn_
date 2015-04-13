package dao;

import com.hhn.dao.*;
import com.hhn.pojo.BankSdbLog;
import com.hhn.pojo.FundInvestmentDetail;
import com.hhn.pojo.FundProduct;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by lenovo on 2014/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
@Transactional
public class FundProductDaoTest {
    @Resource
    private IFundProductDao fundProductDao;
        @Resource
    private IAccountUserDao accountUserDao;
    @Resource
    private IAccountRecommendLogDao accountRecommendLogDao;
    @Resource
    private IAccountUserLogDao accountUserLogDao;
    @Resource
    private IAccountUserThirdDao accountUserThirdDao;
    @Resource
    private IBankSdbLogDao bankSdbLogDao;
    @Resource
    private IDicBankDao dicBankDao;
    @Resource
    private IDicRiskCreditGradeDao dicRiskCreditGradeDao;
    @Resource
    private IDicRiskFactorDao dicRiskFactorDao;
    @Resource
    private IFundMessageRecipientDao fundMessageRecipientDao;
    @Resource
    private IFundTradeDao fundTradeDao;
    @Resource
    private IFundReceiptDao fundReceiptDao;
    @Resource
    private IFundInvestmentDetailDao fundInvestmentDetailDao;
    private @Value("${mysql.host}") String mysql_host;
//    private @Value("${operate.success}") String operate;

    private static FundProduct fundProduct = new FundProduct(24);
    private static Validator validator;
    @BeforeClass
    public static void init() {
        ValidatorFactory vf= Validation.buildDefaultValidatorFactory();
        validator=vf.getValidator();
    }

    @Test
    public void abc() {
//    if(result.hasErrors()){
//        System.out.println(result.getFieldErrors().size());
//        return;
//    }
        BankSdbLog accountRecommendLog = new BankSdbLog();
        Validator valid = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<BankSdbLog>> mes = valid.validate(accountRecommendLog);
//       for(Iterator it=mes.iterator();it.hasNext();)
        for (ConstraintViolation<BankSdbLog> cons : mes) {
//            System.out.println(cons.getConstraintDescriptor().getAttributes());
            System.out.println(mes.size());
            System.out.println(cons.getMessage());
        }
        bankSdbLogDao.save(accountRecommendLog);
    }
  /*  @Test
    public void testSave() {
        System.out.println(accountRecommendLogDao.save(new AccountRecommendLog()));

    }*/

    @Test
    public void testQuery() {
//        BankSdbLog fundProduct = bankSdbLogDao.query(48);
//        System.out.println(fundProduct.getUser_id());
        HashMap<String, Object> param = new HashMap<String,Object>();
        param.put("user_id", 1);
//        fundProductDao.getAllCount(param);
//       List<FundProduct> fundProductList= fundProductDao.queryProduct(BigDecimal.valueOf(3000), Arrays.asList(Byte.valueOf("0"), Byte.valueOf("12")));
//        for(FundProduct fundProduct1:fundProductList)
//            System.out.println(fundProduct1.getProduct_id()+"\t"+fundProduct1.getInvest_amount()+"\t"+fundProduct1.getInvested_amount()+"\t"+fundProduct1.getProduct_status());
//        fundProductDao.queryByTradeId(4757);
//        System.out.println(fundTradeDao.querySurplusMoney());
        Calendar calendar=Calendar.getInstance();calendar.add(Calendar.MONTH,12);
//        System.out.println(fundTradeDao.queryPayMoney(calendar.getTime(), IFundTradeDao.TradeType.INVESTMENT.toString()));
        System.out.println(fundTradeDao.queryPay(calendar.getTime(), IFundTradeDao.TradeType.INVESTMENT.toString()));

/*        List<FundTrade> map=fundProductDao.getWebProductList(param);
        System.out.println(map.size());
        System.out.println(map.get(0).getExpect_trade_time());
        System.out.println(map.get(0).getTrade_amount());
        System.out.println("................");
        System.out.println(map.get(0).getFundInvestmentDetails().size());
        System.out.println(map.get(3).getFundInvestmentDetails().get(1).getTrade_amount());
        System.out.println(map.get(3).getFundInvestmentDetails().get(0).getFundProduct().getProduct_name());*/
//        System.out.println(map.get(3).getFundInvestmentDetails().get(1).getFundProduct().getAccountUser().getUser_name());
//        for(Object key:map.get(0).keySet())
//            System.out.println("key:\t"+key+"===========>value:\t"+map.get(0).get(key));
        System.out.println("mysql.host===>"+mysql_host);
//        System.out.println("operate======>"+operate);
        Map params = new HashMap<String, Object>();
        FundInvestmentDetail fundInvestmentDetail = new FundInvestmentDetail();
        fundInvestmentDetail.setProduct_id(60);
        fundInvestmentDetail.setFund_trade_id(4383);
        params.put("product_id", 60);
        params.put("fund_trade_id", 4383);
        fundInvestmentDetailDao.queryPros(params);
    }

        @Test
    public void testUpdate() {
        FundProduct fundP = new FundProduct(2, 8);
        fundP.setProduct_id(48);
        int fund = fundProductDao.update(fundP);
        System.out.println(fund);
    }

        @Test
    public void testDelete() {
        System.out.println(fundProductDao.delete(48));
    }
    public void testKey(FundProduct fundProduct) {
        Set<ConstraintViolation<FundProduct>> errors=validator.validate(fundProduct);
        for (ConstraintViolation cons : errors) {
            System.out.println(cons.getMessage()+"\t"+cons.getMessageTemplate());
            return;
        }
//        if (result.hasErrors()) {
//            System.out.println("ID in Error:\t" + result.getFieldError("product_id").getDefaultMessage());
////            System.out.println(result.getFieldError("product_id").getRejectedValue());
//            return;
//        }
        System.out.println(fundProduct.getUser_id());
    }
@Test
    public void testKeyInTable(){
//    testKey(fundProduct,new BeanPropertyBindingResult(FundProduct.class,"fundProduct"));
    testKey(fundProduct);
}

    public String getMysql_host() {
        return mysql_host;
    }

    public void setMysql_host(String mysql_host) {
        this.mysql_host = mysql_host;
    }
/*
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }*/
}
