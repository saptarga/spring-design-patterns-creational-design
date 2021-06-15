package saptarga.example.springdesignpatternscreationaldesign.factory.method;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Builder
@Data
@ToString
public class TwitterSocialMedia implements SocialMedia{

    @Getter
    private final String name = "TWITTER";

    @Getter
    private final String link = "https://twitter.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.TWITTER;
}
