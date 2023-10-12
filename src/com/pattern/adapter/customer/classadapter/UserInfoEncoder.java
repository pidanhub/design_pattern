package com.pattern.adapter.customer.classadapter;

import com.pattern.adapter.customer.oa.SystemEncoder;
import com.pattern.adapter.customer.oa.User;
import com.pattern.adapter.threepartyapi.Encoder;

/*
 * @Author Zzs
 * @Description 这个类扮演的就是类适配器，实现了在第三方库上添加更细节的操作的方法，且不修改其源代码
 *              假设系统的需求是：用户名不加密，密码用三次MD5加密，令牌用3次Base64加密
 * @DateTime 2023/10/12 19:24
 */
@SuppressWarnings ("ALL")
public class UserInfoEncoder extends Encoder implements SystemEncoder {
	
	private int times = 3;
	
	public User encode (User user) {
		User encodedUser = User.Builder.builder()
				.name(user.getName())
				.password(strongerMD5(user.getPassword()))
				.token(strongerBASE64(user.getToken()))
				.build();
		return encodedUser;
	}
	
	@Override
	public String strongerMD5 (String input) {
		for (int i = 0; i < times; i++) {
			input = THREE_PARTY_MD5(input);
		}
		return input;
	}
	
	@Override
	public String strongerBASE64 (String input) {
		for (int i = 0; i < times; i++) {
			input = THREE_PARTY_BASE64(input);
		}
		return input;
	}
}
