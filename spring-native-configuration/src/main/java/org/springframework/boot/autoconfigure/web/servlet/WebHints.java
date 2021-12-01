package org.springframework.boot.autoconfigure.web.servlet;

import org.springframework.http.client.AbstractClientHttpRequestFactoryWrapper;
import org.springframework.nativex.hint.Flag;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;

@NativeHint(trigger = AbstractClientHttpRequestFactoryWrapper.class, types =
	@TypeHint(types = AbstractClientHttpRequestFactoryWrapper.class, access = Flag.allDeclaredFields))
public class WebHints implements NativeConfiguration {
}
