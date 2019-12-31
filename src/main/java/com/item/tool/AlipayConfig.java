package com.item.tool;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101400686275";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCdvQaOiL6NbST2jY1zVs6YmaK5foConIk5FWGEM34ci8CgpXHFc1hpAkzMyNsSmz1piD8nY/GbboFvh06AS5EnOBq+WBwm/KNMifAVP0I3eMW71XtHttwnL5wsg8oe7sXlfZazBa8/FgKzcWFTMyhC2yEl+w83KZgxLn2SRpuFOPaSYYimN3x1eTX1UXZV3hH5Y0qVYZJNYg0+tUcjczxEVOd/0R8I8DPe2uSw94Cmz046p/JxoB6cG8Z/JojSTt7gtrVrLQHtN0mR9HoSsKz6eDjegv5nFIiJ/qCiQ7ZZp4NkkZmVpAc0gtlnTjzgafkGBKw81kFwhhyHmpbf9s55AgMBAAECggEAWfTWC21itob7IHyjoZZs5cwgaAcD2qTDAUH3RgyTrDXrGfKgSom4btJ3+AXIIflUcZ3Y3l76B7liqbcRhssRsbsmTU00aOuFOX4k5Akae0YuBiv+TWy0asiVGTHjj/Z9953C1r+0LJch3TIY3fj7yfzsD5v5Fm1rNQkdZdFMmhF4ISCbnipRgt6glGDOSlsj9HK35SFTLia/QiFmBC5zvAmST3MN0EbFywvC2l8mKXPyLfKaBkfrvgq/q1nNR2+DbkVxmi/6yFvUHsla+T4SQ65U9Y2yZ0scaBRoyLBXYMepLNJHFZLxMZiPXZEXcXo1IjxmM8Cw1RhJ0q6eEMM7cQKBgQDJBUPL18bklkGLakgrw1HuTHhAN2SWH0zR9r7740jVsIqkgPjQBeGIwBvO18bfT90hh5hSXZHywDzA0XxC7YYXHJsS3RbdOqdKf+HXsHVFPEDFn1pDQr8G0ckU5qNXYuP0t0UUgCDwL/VvV8KYueIyZLSurKC7W66GHkh52XkUlQKBgQDI4UxdIli7WB3zOR0YcJruoQCSrhdzDL82d3x7QTse8uErv4aUIMJyXcySnHEWUy9UVpZjriYd9GOW35S/YbFzrR1zclsR7zXqU3t0LgSc1c8dPsVi3ZwCuoMI/vFFGXFQ0prit7qCw3hb9OzZZsYyss8tAj2BmnKXnfvItlfVVQKBgHatIAhhHG/pcUrAdVk4187q4Hdw/HZQhkbS+I+28FIQBtn1tm8BedQFLqWf6C4AdVmNNtUxnq+E5JklU8ojdm2AmuC5G/2B2i/2bbur1qAIYWkKmfxplGOPSLqJK1e070WTSTpAJrIGbkzMr/sAitUbdTxGeCIEj3VovXsKdBw9AoGBAL0osrEM08NuoZ1UTdqixrIouBJnjztOaIyQjY6/CT4GdhStILxB8Pii7S2t1Suxn2LqumkZJ1mTtWfwF/DzvJbyEEaTC8DiocGLZTgs0TkieQrP/i0wA2XqXdPNxkJMSBFUkHcnjaDvElp9U78QcVhyWnbGokZ1uqydHuiNFD6VAoGAByceb4bVbzmhM3CXccKWRmfAjoYqrxhFBQp6fH63Xp9BZOX37HFEf90c2XZo6tkCWLUD48QuEJUJ8DtFCVXFwenmzK9dpZEMjqmVXt0BnUa22o5829NrMCjj8+saJ4MqzddmdpXLQISWpMoODUEF8iblmMrj/2KxQqCqt6QKH2E=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiCDLMhWp4XwTNvi7scc6qsxSJoV15QNKXn5DgGD2nNUTTkU+DbkCJDC3I9xcEaADWlMq2J41ZZpnF2WPazWAnbkirPT+0SlusG7LkgtNEgclRjXv5AuvJRCg6m4mncZi6La6nePyfdzZt1J8XxhO0+dFDOavWBnOiuxcUb4ak2rnyda+v9LsCn49Jtr65ot2jvN4ZunC8wNT+EykgCU8V03iDS7FMaMF8UGERo8ASR7IitGAgyHir2W082GmpPhOUX8U+rdDfdmphNrKsyn5GF7YgmG+McR0cYz4WETqetPj4DXDVT317CTLQSckAr2/7uKxnWMS8ud/bn6fSx+ABwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://192.168.2.117:8080/java-basic-spring/order/notify_url.action";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://192.168.2.117:8080/java-basic-spring/order/return_url.action";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

