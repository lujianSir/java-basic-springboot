package com.item.tool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Utils {

	public static String getCurrentymdhms() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	public static String getCurrenttime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	// 获取当前的时间(年月日，时分)
	public static String getCurrent() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	// 获取当前的时间(年月日，时分秒)
	public static String getCurrentHMS() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	// 获取当前的时间(年月日，时分秒)
	public static String getCurrentymd() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	// 获取当前的时间(年月日)
	public static String getCurrentYMD() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	// 获取当前的年月
	public static String getCurrentMouth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月");// 设置日期格式
		String currentTime = df.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}

	// 获取三天后的时间
	public static String getThreeOldTime() {
		Calendar calendar2 = Calendar.getInstance();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		calendar2.add(Calendar.MONTH, 1);
		String three_days_after = sdf2.format(calendar2.getTime());
		return three_days_after;
	}

	/**
	 * 时间戳转换成日期格式字符串
	 * 
	 * @param seconds   精确到秒的字符串
	 * @param formatStr
	 * @return
	 */
	public static String timeStampDate(String seconds, String format) {
		if (seconds == null || seconds.isEmpty() || seconds.equals("null")) {
			return "";
		}
		if (format == null || format.isEmpty()) {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(seconds + "000")));
	}

	/**
	 * 时间戳转换成日期格式字符串(转为年月日)
	 * 
	 * @param seconds   精确到秒的字符串
	 * @param formatStr
	 * @return
	 */
	public static String timeStampDateChinese(String seconds, String format) {
		if (seconds == null || seconds.isEmpty() || seconds.equals("null")) {
			return "";
		}
		if (format == null || format.isEmpty()) {
			format = "yyyy年MM月dd日";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(seconds + "000")));
	}

	public static String timeStampDateChineseshot(String seconds, String format) {
		if (seconds == null || seconds.isEmpty() || seconds.equals("null")) {
			return "";
		}
		if (format == null || format.isEmpty()) {
			format = "yyyy年MM月";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(seconds + "000")));
	}

	/**
	 * 取得当前时间戳（精确到秒）
	 * 
	 * @return
	 */
	public static String timeStamp() {
		long time = System.currentTimeMillis();
		String t = String.valueOf(time / 1000);
		return t;
	}

	// 日期转换为时间戳 (精确到毫秒)
	public static String timeToStamp(String timers) throws java.text.ParseException {
		Date d = new Date();
		String timeStemp = "";
		try {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			d = sf.parse(timers);// 日期转换为时间戳
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeStemp = String.valueOf(d.getTime() / 1000);
		return timeStemp;
	}

	public static String timeToStampshot(String timers) throws java.text.ParseException {
		Date d = new Date();
		String timeStemp = "";
		try {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
			d = sf.parse(timers);// 日期转换为时间戳
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeStemp = String.valueOf(d.getTime() / 1000);
		return timeStemp;
	}

	/**
	 * 两个时间之间相差距离多少天
	 * 
	 * @param one 时间参数 1：
	 * @param two 时间参数 2：
	 * @return 相差天数
	 */
	public static Map<String, Object> getDistanceDays(String starttime, String endtime) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date one;
		Date two;
		long days = 0;
		String str = "";
		int status = 0;// 违约还是没有违约状态
		try {
			one = df.parse(starttime);
			two = df.parse(endtime);
			long time1 = one.getTime();
			long time2 = two.getTime();
			long diff;

			if (time1 > time2) {
				diff = time1 - time2;
				str = "还有";
				status = 1;

			} else {
				diff = time2 - time1;
				str = "逾期";
			}
			days = diff / (1000 * 60 * 60 * 24);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String s = str + days + "天";
		map.put("status", status);// 0是违约 1是还有剩余时间
		map.put("content", s);
		return map;// 返回相差多少天
	}

	public static String getHour(String startTime, String endTime, String format) throws Throwable {
		// 按照传入的格式生成一个simpledateformate对象
		SimpleDateFormat sd = new SimpleDateFormat(format);
		long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
		long nh = 1000 * 60 * 60;// 一小时的毫秒数
		long nm = 1000 * 60;// 一分钟的毫秒数
		long ns = 1000;// 一秒钟的毫秒数
		long diff;
		// 获得两个时间的毫秒时间差异
		diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		long day = diff / nd;// 计算差多少天
		long hour = diff % nd / nh;// 计算差多少小时
		long min = diff % nd % nh / nm;// 计算差多少分钟
		long sec = diff % nd % nh % nm / ns;// 计算差多少秒//输出结果
		if (day > 0) {
			hour = day * 24 + hour;
		}
		if (hour > 0) {
			min = hour * 60 + min;
		}
		// System.out.println("时间相差：" + day + "天" + hour + "小时" + min + "分钟" + sec +
		// "秒。");
		return min + "";
	}

	public static void main(String[] args) throws Exception {
//		String startday = "2020-03-13";// 到期时间
//		String endday = "2020-03-13";// 当前时间
//		Map<String, Object> DistanceDays = getDistanceDays(startday, endday);// 两个时间之间相差距离多少天
//		System.out.println(DistanceDays);
////		String timeStamp = timeStamp();
////		String date = timeStampDate(timeStamp, null);
////		String date2 = timeStampDate2(timeStamp, null);
////		System.out.println(date);
////		System.out.println(date2);
//		String timeStemp = timeToStampshot("2020-03");
//		String date = timeStampDateChineseshot(timeStemp, null);
//		System.out.println(timeStemp);
//		System.out.println(date);

		if (java.awt.Desktop.isDesktopSupported()) {
			try {
				// 创建一个URI实例
				java.net.URI uri = java.net.URI.create("https://www.baidu.com/");
				// 获取当前系统桌面扩展
				java.awt.Desktop dp = java.awt.Desktop.getDesktop();
				// 判断系统桌面是否支持要执行的功能
				if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
					// 获取系统默认浏览器打开链接
					dp.browse(uri);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(getCurrentymdhms());
	}

}
