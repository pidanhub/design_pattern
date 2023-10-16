package com.pattern.prototype;

import com.pattern.prototype.resume.prototype.CopyHandler;
import com.pattern.prototype.resume.template.ResumeTemplate;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/16 15:24
 */
public class Main {
	
	public static void main (String[] args) throws CloneNotSupportedException {
		ResumeTemplate template = new ResumeTemplate("zhang san");
		System.out.println("template " + template);
		
		System.out.println("-----deep copy------");
		// 生成一个新简历，并且选择是否修改，这一次生成的简历是不影响原来的简历的情况
		ResumeTemplate resumeTemplateCopy = new CopyHandler(template).getResumeTemplateCopy(true);
		System.out.println("resumeTemplateCopy " + resumeTemplateCopy);
		
		System.out.println("===change picture===");
		resumeTemplateCopy.changePhoto("()");
		System.out.println("template " + template);
		System.out.println("resumeTemplateCopy " + resumeTemplateCopy);
		
		System.out.println("-----shallow copy-----");
		ResumeTemplate resumeTemplateCopy1 = new CopyHandler(template).getResumeTemplateCopy(false);
		System.out.println("resumeTemplateCopy1 " + resumeTemplateCopy1);
		
		System.out.println("===change picture===");
		resumeTemplateCopy1.changePhoto("[]");
		System.out.println("template " + template);
		System.out.println("resumeTemplateCopy " + resumeTemplateCopy);
		System.out.println("resumeTemplateCopy1 " + resumeTemplateCopy1);
	}
}
