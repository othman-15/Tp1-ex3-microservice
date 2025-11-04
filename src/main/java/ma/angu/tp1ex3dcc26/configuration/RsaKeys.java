package ma.angu.tp1ex3dcc26.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPublicKey;
@ConfigurationProperties(prefix = "rsa")
public record RsaKeys(RSAPublicKey publicKey) {
}
