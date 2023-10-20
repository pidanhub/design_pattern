package com.pattern.visitor.visitor.impl;

import com.pattern.visitor.visitor.CodeReviewVisitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * @Author Zzs
 * @Description 查看源代码中每个类和每个方法源代码的行数
 * @DateTime 2023/10/20 21:08
 */
public class CheckLinesVisitor implements CodeReviewVisitor {
	
	@Override
	public void visit (Class<?> args) {
		// 不加"./"是错的
		System.out.println("count lines...");
		File file = new File("./src/" + args.getName().replaceAll("\\.", "/") + ".java");
		checkCodeLines(file);
	}
	
	private void checkCodeLines (File file) {
		// 检查源代码行数
		try (
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String read;
			int i;
			boolean blockAnnotationFlag = false;
			for (i = 0; (read = bufferedReader.readLine()) != null; ++i) {
				if (read.trim().equals("") || read.trim().startsWith("//"))
					--i;
				else if (read.contains("/*") || read.contains("*/") || blockAnnotationFlag) {
					// 防止有人在一行内写"块注释"
					--i;
					blockAnnotationFlag = !read.contains("*/");
					if (read.contains("/*") && !read.trim().startsWith("/*")) ++i;
					if (read.matches(".*(/*).*(\\*/).*")) {
						blockAnnotationFlag = false;
					}
				}
			}
			System.out.println("源代码行数：" + i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
