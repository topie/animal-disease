package com.topie.security.security;

public class OrangeAuthenticationRequest {

    private static final long serialVersionUID = 6624726180748515507L;

    private String username;

    private String password;

    private String vcode;

    private String vkey;

    public OrangeAuthenticationRequest() {
    }

    public OrangeAuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getVkey() {
        return vkey;
    }

    public void setVkey(String vkey) {
        this.vkey = vkey;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
