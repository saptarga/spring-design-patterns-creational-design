package saptarga.example.springdesignpatternscreationaldesign.factory.method;

import lombok.*;

@Builder
@Data
@ToString
public class FacebookSocialMedia implements SocialMedia{

    @Getter
    private final String name = "FACEBOOK";

    @Getter
    private final String link = "https://facebook.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.FACEBOOK;

}
