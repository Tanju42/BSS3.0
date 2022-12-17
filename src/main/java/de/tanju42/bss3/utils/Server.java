package de.tanju42.bss3.utils;

public class Server {
    String configName;
    String displayName;
    boolean autoStart;
    boolean tempStart;
    String dir;
    Integer port;
    String motd;
    String ram;
    String jar;

    public Server(String configname, String displayname, boolean autostart, boolean tempstart, String dir, Integer port, String motd, String ram, String jar) {
        this.configName = configname;
        this.displayName = displayname;
        this.autoStart = autostart;
        this.tempStart = tempstart;
        this.dir = dir;
        this.port = port;
        this.motd = motd;
        this.ram = ram;
        this.jar = jar;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isAutoStart() {
        return autoStart;
    }

    public void setAutoStart(boolean autoStart) {
        this.autoStart = autoStart;
    }

    public boolean isTempStart() {
        return tempStart;
    }

    public void setTempStart(boolean tempStart) {
        this.tempStart = tempStart;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getJar() {
        return jar;
    }

    public void setJar(String jar) {
        this.jar = jar;
    }

    @Override
    public String toString() {
        return "Server{" +
                "configName='" + configName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", autoStart=" + autoStart +
                ", tempStart=" + tempStart +
                ", dir='" + dir + '\'' +
                ", port=" + port +
                ", motd='" + motd + '\'' +
                ", ram='" + ram + '\'' +
                ", jar='" + jar + '\'' +
                '}';
    }
}
