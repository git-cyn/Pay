package controller.utils.alipay.config;
public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016091200490601";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC0ncTH6ls10G2fkoKnfs6k2sQhg+WzJ7l2Em7v6vtK2+TyF9ENKtcM+r6ggLoQFwz8uk2VWA3YjeEBkOgJOYFcenK+VMGP8YiuX7voCWYuArfhGeednwotBnlToeoheLAxk58tQsFPWtLfktmLh5K15zHahpJmMWTw7JuZ60W0TnEJ0R3sNeBydlN8e/abFgvgcYtfaXaV0a+/PgWj+UIbF61JvCDqiEPAXRJepbOqRI+fdFwPNt1rgjQ1mZ9GDJ1ggj2ujzBxUlpLmsrkjr6JPfC5WjnU5RicPO34VD4hvrBiOOhsHynrN1Kltoy2HCfypPrv+Eq5IFksmip3Yj2DAgMBAAECggEBAIT5arksp35VN4A2I48hYw4oKiHqs6BU7MwrAhYM0HnqrwI12qlxEubxbItKerIB5oPivd/n9jmrKy81+j9gYQcu9299gwxw7QpEXVmWIe5Z/fryUX3Qa3N+wrB6EqAV9NJrNtPhw+Sin4IO4a9CXxchYajbTsmCMCjYai7F8omtwMXo4t3ypiU06MhRGWjgNFDRzS6Jh5WBU0W2uUngVZxjqw1B8BtVc1+TmGFv4wkr92ArMSWv5vGFF3M3Aj3H24MEccsdgkfpyheRw8lh1gqttK+CH1ljQ/Gzs2ycCnOgZi00xaJcS80sPpuQR/00UWuywhDyRQ/HzgVQq+nD0AECgYEA64/QrEENOb+W2ZG2qfK1NvLmcVJ2FT0QDVIwp3+SDyBA1axLAMf47BUdZjsiYE1FANgIPhBBb/Xuk05ppRa5MVeon6SnqzTcN8D+WIZ5G98sGC+nj2hLlCyLtJwr4Be/tLKBZo072KAeJecOU7x1kfVtvy+YDhhx1lqauDIKRAECgYEAxEmH2hn/VyrD+27s+hcvPQUyD77AZE/51sQ5kcuZK8KftViMJUDpL3euy5Mncxth9wZQJi7qqg2uJuGHcy61utHPGN4zIT9+9q1lYzrFk1FJFODjMp0PBVlbb39pXfzdfp9ex+vNai4OAIyeodmyu42q87OehpQHPp1qKKAdcYMCgYA63FzQLhEX9P/Erdxu6u7NJDTg7DIFbJSuP3NY50+f5/dLbRnwwAc7Nqt5+BzG44fyhgjJOVagm1taA6XyUpND+RtxiLs81KCSbe8gP7nTdRiXkpDUDMOV6uud3cg43rZQeKpM7c2ee6QM5Id39QeLyT/7HfFo1ELdxRYUIKzgAQKBgHCvpgZYFnb8Xjbin7mTxdLKQMs5P0pXf58EV+iTcgPlX7rEcvCQK07M7tSATo2Oktc2EJ1bIe0unWRE5XYCwuHVwYcNSV01DrafJS2qd/LzH3mVAdn0wMLZYdzI0LzchmxDIi6z+OGUPwWhtRBF4o457oKqA8BPCzmvNVrNURnxAoGAXo4m2ZBFvXCx0RYz2wkVwr5Z62fXABGoJuZYmuvNC8y+80tqt+8km6N9YiCoJliT73yQ+vuhslXiGKnvneRXaAeV36kAEmMD1a4Z1BBxrhaEEeHqVapNAIpSIeL5XairqMOquygiSa9PvVoxCWBNngj5KDvm+AK4RYCNemlt7Fc=";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://192.168.1.107:8080/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://192.168.1.107:8080/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzAoEjx0wDfJw2QaWF1LQU2XicgiU17wr54BpbvHkFuv5sJCFMfS2Mulqj3LPsaJZfAsh19UPHWdkIPF8oRIEgQcLeUCzK53cfl1Iop1SLfN1ocHaGbF81YnOHM+R5TXUpOhkSd8vqIc97sOY2PKGCfWHFUbiSLtqDfGROnF2kpzWB1Eqxls1tuEChJ5+5gJRy2+fEHZuhzRqvL+3kn3YH74ohYsh+Ci1veaXPixyvFrjOshpuGBsTCGNrXaWiIqOJvTd/5yHlpFaDkTGkfI561bclYFgpnlbJ6oJp/YfYwvJ9mDWPJJuuKmzrNDY12mKn2aghZzTS26tzgOrh1guFQIDAQAB";
	// 日志记录目录
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
