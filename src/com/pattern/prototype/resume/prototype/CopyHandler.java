package com.pattern.prototype.resume.prototype;

import com.pattern.prototype.resume.template.ResumeTemplate;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/16 15:59
 */
public class CopyHandler {
	
	private final ResumeTemplate resumeTemplate;
	
	public CopyHandler (ResumeTemplate resumeTemplate) {
		this.resumeTemplate = resumeTemplate;
	}
	
	public ResumeTemplate getResumeTemplateCopy (boolean isDeepCopy) {
		return resumeTemplate.getClone(isDeepCopy);
	}
	
}
