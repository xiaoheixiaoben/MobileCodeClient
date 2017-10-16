package cn.com.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * 
 * @author Administrator
 * @date 2017-10-16
 */
public class Test {

	public static void main(String[] args) {
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		MobileCodeWSSoap soap = mobileCodeWS.getMobileCodeWSSoap();
		String mobileCodeInfo = soap.getMobileCodeInfo("13720071", "");

		System.out.println(mobileCodeInfo);

	}

}
