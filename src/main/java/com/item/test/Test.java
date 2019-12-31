package com.item.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Test {
	
	private static String a = "1";
	private static String b = "2";	
	
	public static void main(String[] args) {
//		String a = JavaTool.string2MD5("123456");
//		System.out.println(a);
//		System.out.println(randomNum());
		
		deleteFile("D:\\\\upload\\\\web\\\\模型封面\\\\1574822545297.jpg");
	}
	
	/**
     * 生成固定长度随机码
     * @param len 长度
     */
    @SuppressWarnings("unused")
	private static String randomNum() {
        long min = 1,max = 9; 
        for (int i = 1; i < 18; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;
        return Long.toString(rangeLong);
    }
    
    
	/**
	 * 删除文件
	 * 
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	public static boolean deleteFile(String pathname){
		boolean result = false;
		File file = new File(pathname);
		if (file.exists()) {
			file.delete();
			result = true;
			System.out.println("文件已经被成功删除");
		}
		return result;
	}
	
}
