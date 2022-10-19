package liskovSubstitution;

public abstract class SocialMedia {

    //@support WhatsApp, Facebook, Instagram
    public abstract void chatWithFriend();
    //@support Facebook, Instagram
    public abstract void publishPost(Object post);
    //@support Facebook, Instagram, WhatsApp
    public abstract void sendPhotosAndVideos();
    //@support Facebook, WhatsApp
    public abstract void groupVideoCall(String... users);

}
