package com.suneee.start;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

public class MyPasswordEncoder extends Pbkdf2PasswordEncoder{
	@Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }
	@Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }

}
