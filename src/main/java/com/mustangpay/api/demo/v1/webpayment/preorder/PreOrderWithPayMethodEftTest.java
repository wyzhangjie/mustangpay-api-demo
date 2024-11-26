package com.mustangpay.api.demo.v1.webpayment.preorder;

import com.mustangpay.api.constants.MustangpayApiConstantsV1;
import com.mustangpay.api.enums.CurrencyEnum;
import com.mustangpay.api.enums.OperationEnum;
import com.mustangpay.api.enums.PayMethodEnum;
import com.mustangpay.api.pojo.*;
import com.mustangpay.api.utils.mustangpay.MustangpayApiUtilsV1;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: hyssop
 * @Date: 08/28/2024
 */
@Slf4j
public class PreOrderWithPayMethodEftTest extends BaseTest {
    public static void main(String[] args) {
        PreOrderWithPayMethodEftTest test = new PreOrderWithPayMethodEftTest();
        // Assuming the Amount and Product classes are defined elsewhere with constructors as needed
        CreateCashierReq createCashierReq = test.fillPreOrderReq();
        MustangpayApiUtilsV1<CashierCreateResp> v1 = new MustangpayApiUtilsV1();
        ResponseResult<CashierCreateResp> result =  v1.callTest("PreOrderWithPayMethodEftTest", createCashierReq, OperationEnum.PRECREATE.getCode());
        // PreOrderWithPayMethodEftTest result ->{result={"code":"000000","data":{"amount":{"currency":"ZAR","value":1000},"cashierUrl":"http://110.238.76.97:90/pre-cashier?orderNo=ozfJuCr0uHf6vrO_MYK4a1Y6an85EYg2cK0PK30f-b0=","errorCode":"","errorMessage":"","merchantId":"4449999220","orderNo":"2408291010032979473","orderStatus":"Pending","redirectPayParam":{"CHECKSUM":"468c4203f3e234d79321d8cdda14d237","PAYGATE_ID":"1039903103954","PAY_REQUEST_ID":"4B4054B1-17B0-460C-AB57-A0B394E27EEC","REFERENCE":"24082913203771"},"redirectPayUrl":"https://secure.paygate.co.za/PayHost/process.trans","reference":"a1299a0d-c79f-49f5-b3cf-a8659577a9f3"},"msg":"ok","sign":"YFXIqFUqo3IsaS0pX7g4WcUq53pLy3GPj_MavtDfqtnjlfINJyhf59h4Pg_s6EHRSgACJpPiQNxfEEhvl4jzXWb3RUDqtNyWdgT54kBmXiqUXyPT3m81xL3hRY2XOd0QSH0cZV-XvGDFOOlvfLWN9vltJCcbLc7cABwwchVcVOIBc-AoZkFZLTU6bRPozeZNjNg
        // stqfeohVZfeHrII4I27o-R-_fxff8ISwXt8xLcHWN4r99pAeE-ksV8OImVeN1v6-CPcAxx6IKhSfr-yXCZYatgkgFzY2F79dG5XtR4pRjBA04n_uhm2i1cTj1xgmq_LJrTwihFifZujoRf5xA8g"}, code=S}
        log.info("PreOrderWithPayMethodEftTest result ->{}", result);
    }
    @Override
    List<String> fillPayMethodInfo() {
        List<String> payMethods = new ArrayList<>();
        payMethods.add(PayMethodEnum.INSTANT_EFT.getCode());
        return payMethods;
    }
}
