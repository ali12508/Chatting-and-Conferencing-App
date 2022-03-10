package io.realm;


public interface com_tech_world_model_realms_TempMessageRealmProxyInterface {
    public String realmGet$messageId();
    public void realmSet$messageId(String value);
    public String realmGet$fromId();
    public void realmSet$fromId(String value);
    public String realmGet$fromPhone();
    public void realmSet$fromPhone(String value);
    public String realmGet$toId();
    public void realmSet$toId(String value);
    public int realmGet$type();
    public void realmSet$type(int value);
    public String realmGet$content();
    public void realmSet$content(String value);
    public String realmGet$timestamp();
    public void realmSet$timestamp(String value);
    public String realmGet$chatId();
    public void realmSet$chatId(String value);
    public int realmGet$messageStat();
    public void realmSet$messageStat(int value);
    public String realmGet$localPath();
    public void realmSet$localPath(String value);
    public int realmGet$downloadUploadStat();
    public void realmSet$downloadUploadStat(int value);
    public String realmGet$metadata();
    public void realmSet$metadata(String value);
    public boolean realmGet$voiceMessageSeen();
    public void realmSet$voiceMessageSeen(boolean value);
    public String realmGet$mediaDuration();
    public void realmSet$mediaDuration(String value);
    public String realmGet$thumb();
    public void realmSet$thumb(String value);
    public boolean realmGet$isForwarded();
    public void realmSet$isForwarded(boolean value);
    public String realmGet$videoThumb();
    public void realmSet$videoThumb(String value);
    public String realmGet$fileSize();
    public void realmSet$fileSize(String value);
    public com.tech.world.model.realms.RealmContact realmGet$contact();
    public void realmSet$contact(com.tech.world.model.realms.RealmContact value);
    public com.tech.world.model.realms.RealmLocation realmGet$location();
    public void realmSet$location(com.tech.world.model.realms.RealmLocation value);
    public boolean realmGet$isGroup();
    public void realmSet$isGroup(boolean value);
    public boolean realmGet$isBroadcast();
    public void realmSet$isBroadcast(boolean value);
    public boolean realmGet$isSeen();
    public void realmSet$isSeen(boolean value);
    public String realmGet$encryptionType();
    public void realmSet$encryptionType(String value);
    public com.tech.world.model.realms.QuotedMessage realmGet$quotedMessage();
    public void realmSet$quotedMessage(com.tech.world.model.realms.QuotedMessage value);
}