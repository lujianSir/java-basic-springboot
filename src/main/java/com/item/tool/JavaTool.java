package com.item.tool;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/** 工具类
 * @author hjy
 *
 */
public class JavaTool {
	
	/** MD5生成消息摘要算法
	 * 
	 * @param inStr
	 * @return
	 */
	public static String string2MD5(String inStr) {

		// 申明消息摘要算法
		MessageDigest md5 = null;

		try {
			// 指定MD5算法
			md5 = MessageDigest.getInstance("MD5");

		} catch (Exception e) {

			e.printStackTrace();

			return "不存在的算法！";
		}

		char[] charArray = inStr.toCharArray();

		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)

			byteArray[i] = (byte) charArray[i];

		byte[] md5Bytes = md5.digest(byteArray);

		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < md5Bytes.length; i++) {

			int val = ((int) md5Bytes[i]) & 0xff;

			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	
	
	/**
     * 生成固定长度随机码
     * @param len 长度  目前长度为12
     */
    public static long randomNum() {
    	
    	//此处固定为十一位 可以进行修改
        long min = 1,max = 9; 
        for (int i = 1; i < 12; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;
        return rangeLong;
    }
    
    
    // 生成二维码
 	public static void encodeImg(String imgPath, String format, String content, int width, int height, String logo) {

 		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
 		// 排错率 L<M<Q<H
 		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
 		// 编码
 		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
 		// 外边距：margin
 		hints.put(EncodeHintType.MARGIN, 1);
 		/*
 		 * content : 需要加密的 文字 BarcodeFormat.QR_CODE:要解析的类型（二维码） hints：加密涉及的一些参数：编码、排错率
 		 */
 		try {

 			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);

 			// 内存中的一张图片：此时需要的图片 是二维码-> 需要一个boolean[][] ->BitMatrix
 			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

 			for (int x = 0; x < width; x++) {
 				for (int y = 0; y < height; y++) {
 					image.setRGB(x, y, (bitMatrix.get(x, y) ? 0xFF000000 : 0xFFFFFFFF));
 				}
 			}
 			
 			if(logo != "") {
 				// 画logo
 				image = logoMatrix(image, logo) ;
 			}
 			// string->file
 			File file = new File(imgPath);
 			// 生成图片
 			ImageIO.write(image, format, file);

 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	}

 	// 解密：二维码->文字
 	@SuppressWarnings({ "rawtypes", "unchecked" })
 	public static void decodeImg(File file) throws Exception {
 		if (!file.exists())
 			return;
 		// file->内存中的一张图片
 		BufferedImage imge = ImageIO.read(file);

 		MultiFormatReader formatReader = new MultiFormatReader();
 		LuminanceSource source = new BufferedImageLuminanceSource(imge);
 		Binarizer binarizer = new HybridBinarizer(source);
 		BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
 		// 图片 ->result
 		Map map = new HashMap();
 		map.put(EncodeHintType.CHARACTER_SET, "utf-8");
 		Result result = formatReader.decode(binaryBitmap, map);
 		System.out.println("解析结果：" + result.toString());
 	}

 	// 传入logo、二维码 ->带logo的二维码
 	public static BufferedImage logoMatrix(BufferedImage matrixImage, String logo) {
 		//在二维码上画logo:产生一个  二维码画板
 		Graphics2D g2 = matrixImage.createGraphics();
 		//画logo： String->BufferedImage(内存)
 		try {
 			BufferedImage logoImg = ImageIO.read(new File(logo));
 			int height = matrixImage.getHeight();
 			int width = matrixImage.getWidth();
 			//纯logo图片
 			g2.drawImage(logoImg, width * 2 / 5, height * 2 / 5, width * 1 / 5, height * 1 / 5, null);
 			//产生一个 画 白色圆角正方形的 画笔
 			BasicStroke stroke = new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
 			//将画板-画笔 关联
 			g2.setStroke(stroke);
 			//创建一个正方形
 			RoundRectangle2D.Float round = new RoundRectangle2D.Float(width * 2 / 5, height * 2 / 5, width * 1 / 5, height * 1 / 5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
 			g2.setColor(Color.WHITE);
 			g2.draw(round);
 			
 			//灰色边框
 			BasicStroke stroke2 = new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
 			g2.setStroke(stroke2);
 			//创建一个正方形
 			RoundRectangle2D.Float round2 = new RoundRectangle2D.Float(width * 2 / 5 + 2, height * 2 / 5 + 2, width * 1 / 5 - 4, height * 1 / 5 - 4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
 			g2.setColor(Color.GRAY);
 			g2.draw(round2);
 			g2.dispose();
 			
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}

 		return matrixImage;
 	}
 	
 	/**
 	 * 获取32位UUID
 	 * @return
 	 */
 	public static String getUserId() {
 		String uuid = UUID.randomUUID().toString(); 		
 		uuid = uuid.replace("-", "");        
 		return uuid;
 	}
 	
 	//获取当前时间
 	public static String getCurrent() {
 		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式		
 		return df.format(new Date());
 	}
 	
 	//获取时间
 	public static String getTime(int num) {
 		String str="";
 		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
 		switch (num) {
		case 1://一个月
			c.setTime(new Date());
	        c.add(Calendar.MONTH, 1);
	        Date m = c.getTime();
	        str = format.format(m);
			break;
		case 2://半年
			 c.setTime(new Date());
		     c.add(Calendar.MONTH, 6);
		     Date m3 = c.getTime();
		     str = format.format(m3);			
			break;
		case 3://一年
			 c.setTime(new Date());
		     c.add(Calendar.YEAR, 1);
		     Date y = c.getTime();
		     str = format.format(y);			
			break;
		case 4://永久			
			break;
		default:
			break;
		}	
 		return str;
 	}	
}
