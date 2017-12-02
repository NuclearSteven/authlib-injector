package org.to2mbn.authlibinjector.login.yggdrasil.core;

import java.util.UUID;
import org.to2mbn.authlibinjector.login.yggdrasil.AuthenticationException;

public interface AuthenticationService {

	Session login(String username, String password, String clientToken) throws AuthenticationException;

	Session refresh(String clientToken, String accessToken) throws AuthenticationException;

	Session selectProfile(String clientToken, String accessToken, UUID profile) throws AuthenticationException;

	boolean validate(String accessToken) throws AuthenticationException;

	boolean validate(String clientToken, String accessToken) throws AuthenticationException;

	void invalidate(String clientToken, String accessToken) throws AuthenticationException;

	void signout(String username, String password) throws AuthenticationException;

}
