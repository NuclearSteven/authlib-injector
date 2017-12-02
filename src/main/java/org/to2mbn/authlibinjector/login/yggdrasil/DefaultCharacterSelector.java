package org.to2mbn.authlibinjector.login.yggdrasil;

import org.to2mbn.authlibinjector.login.yggdrasil.core.GameProfile;

public class DefaultCharacterSelector implements CharacterSelector {

	@Override
	public GameProfile select(GameProfile[] availableProfiles) {
		return availableProfiles.length > 1 ? availableProfiles[0] : null;
	}

}
