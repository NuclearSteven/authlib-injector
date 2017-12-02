package org.to2mbn.authlibinjector.login.yggdrasil.core.texture;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

public class URLTexture implements Serializable, Texture {

	private static final long serialVersionUID = 1L;

	private URL url;
	private Map<String, String> metadata;

	public URLTexture(URL url, Map<String, String> metadata) {
		this.url = Objects.requireNonNull(url);
		this.metadata = metadata;
	}

	public URL getURL() {
		return url;
	}

	@Override
	public Map<String, String> getMetadata() {
		return metadata;
	}

	@Override
	public InputStream openStream() throws IOException {
		return url.openStream();
	}

	@Override
	public String toString() {
		return "URLTexture [url=" + url + ", metadata=" + metadata + "]";
	}
}
